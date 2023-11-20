import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Quiz12 {
    private static final Set<BufferedWriter> clientWriters = Collections.synchronizedSet(new HashSet<>());

    public static void main(String[] args) throws IOException {
        int port = 12345;

        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignore) {
                System.err.println("Port는 0 ~ 65535 까지의 정수만 가능합니다.");
                System.exit(1);
            }
        }


        System.out.println("서버가 포트 " + port + "에서 실행 중입니다...");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                new Client(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.err.println("서버를 열 수 없습니다: " + e.getMessage());
            System.exit(1);
        }
    }

    private static class Client extends Thread {
        private Socket socket;

        public Client(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {

                clientWriters.add(writer);

                String clientAddress = socket.getInetAddress().getHostAddress() + ":" + socket.getPort();
                System.out.println(clientAddress + "가 연결되었습니다.");

                String message;
                while ((message = reader.readLine()) != null) {
                    broadcastMessage(message);
                }
            } catch (IOException e) {
                System.err.println("클라이언트 처리 중 오류 발생: " + e.getMessage());
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    // 소켓 종료 실패 처리
                }
            }
        }

        private void broadcastMessage(String message) {
            synchronized (clientWriters) {
                for (BufferedWriter writer : clientWriters) {
                    try {
                        writer.write(message + "\n");
                        writer.flush();
                    } catch (IOException e) {
                        System.err.println("메시지 전송 실패: " + e.getMessage());
                    }
                }
            }
        }
    }
}