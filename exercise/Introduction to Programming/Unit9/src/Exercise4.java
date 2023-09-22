import java.io.*;
public class Exercise4 {
    public static void main(String[] args) {
        int n=10;
        int[] v = new int[n];
        FileReader f = new FileReader("dati.txt");
        BufferedReader in = new BufferedReader(f);
        int i=0;
        String linea = in.readLine();
        while (linea!=null) {
            v[i] = Integer.parseInt(linea);
            linea = in.readLine();
            i++;
        }
        f.close();
    }
    // unreported exception java.io.FileNotFoundException   파일이 존재하지 않아서 오류 발생
    // unreported exception java.io.IOException IOException을 예외처리 해주지 않아서 발생  main(String[] args) throws IOException
}