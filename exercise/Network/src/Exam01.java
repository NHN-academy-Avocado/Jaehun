import java.io.IOException;
import java.net.Socket;

public class Exam01 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            System.out.println("서버에 연결되었습니다.");
            socket.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}