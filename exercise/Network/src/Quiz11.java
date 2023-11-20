import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz11 {

    static int bufferSize = 2048;

    static class ClientHandler implements Runnable {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (BufferedInputStream socketIn = new BufferedInputStream(socket.getInputStream());
                 BufferedOutputStream socketOut = new BufferedOutputStream(socket.getOutputStream())) {

                System.out.println(socket.getInetAddress().getHostAddress() + ":" + socket.getPort() + "가 연결되었습니다.");
                byte[] buffer = new byte[bufferSize];
                int length;
                while ((length = socketIn.read(buffer)) > 0) {
                    socketOut.write(buffer, 0, length);
                    socketOut.flush();
                }
            } catch (IOException ignore) {
                System.out.println("클라이언트 서비스 중 오류 발생");
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    // 소켓 종료 실패 처리
                }
            }
        }
    }

    public static void main(String[] args) {
        int port = 12345;

        if (args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignore) {
                System.err.println("Port는 0 ~ 65535 까지의 정수만 가능합니다.");
                System.exit(1);
            }
        }

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("서버가 포트 " + port + "에서 실행 중입니다...");
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket socket = serverSocket.accept();
                    new Thread(new ClientHandler(socket)).start();
                } catch (IOException e) {
                    System.out.println("클라이언트 연결 중 오류 발생");
                }
            }
        } catch (IOException ignore) {
            System.out.println("서버 소켓 생성 실패");
        }
    }
}
