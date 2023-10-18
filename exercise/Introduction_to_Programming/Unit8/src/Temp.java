import java.io.*;

public class Temp {
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/test.txt")))) {
            char[] buf = new char[1024];
            int len;
            while ((len = br.read(buf)) != -1) {
                sb.append(buf, 0, len);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String string = sb.toString();
        System.out.println(string);












        try(FileReader fin = new FileReader("src/test.txt")){
            char[] buf = new char[5];
            int n=0, count=0;
            while((n=fin.read(buf, 0, buf.length))!=-1){
                for(int i=0; i<n; i++){
                    System.out.print(buf[i]);
                }
                count++;
                System.out.println();
            }
            System.out.println("\n" + count);
//            int c;
//            while((c=fin.read())!=-1){
//                System.out.print((char)c);
//            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
