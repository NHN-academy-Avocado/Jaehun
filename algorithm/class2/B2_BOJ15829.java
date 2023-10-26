import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_BOJ15829 {
    private static final long M = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String line = br.readLine();
        long result = 0;
        long pow =1;
        for(int i=0; i<l; i++){
            result += ((line.charAt(i)-96)*pow)%M;
            pow = (pow*31)%M;
        }
        System.out.println(result%M);
    }
}
