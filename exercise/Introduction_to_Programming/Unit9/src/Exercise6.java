import java.io.*;

public class Exercise6 {
    public static void main(String[] args) throws ExceptionLineTooLong, IOException  {
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            char[] buf = new char[1024];
            int n=0;
            while((n=br.read(buf))!=1){
                if(n>80){
                    throw new ExceptionLineTooLong();
                }
            }
        }
    }
}
