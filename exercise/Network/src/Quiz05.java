import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Quiz05 {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;
        if(args.length>0){
            host = args[0];
        }
        try{
            if (args.length > 1) {
                port = Integer.parseInt(args[1]);
            }
        }catch (NumberFormatException e){
            System.err.println("Port가 올바르지 않습니다.");
            System.exit(1);
        }


        try (Socket socket = new Socket(host, port)) {
            System.out.println("서버에 연결되었습니다.");
            int ch;
            byte[] buffer = new byte[1024];
            BufferedInputStream input = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream output = new BufferedOutputStream(System.out);
//            BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream());
            while ((ch = input.read(buffer))>= 0) {
                if(new String(buffer,0,ch).trim().equals("exit")){
                    break;
                }
                output.write(buffer, 0, ch);
                output.flush();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
