import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        print();
    }

        public static void print() throws IOException{
        try(BufferedReader br = new BufferedReader(new FileReader("src/ex3.txt"));) {
            String s;
            while ((s = br.readLine()) != null) {
                if (s.charAt(0) == '/' || s.charAt(0) == ';' || s.charAt(0) == '%') {
                        System.out.println(s);
                    }
                }
            }
        }
}
