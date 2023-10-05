import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        // default = 1
        // 2~7 6개
        // 8~17 12개
        // 20~37 18개
        // 38~61 24개
        final int ADD = 6;
        int lineCount=0;
        int tmp = 1;
        while(n!=1){
            lineCount+=ADD;
            tmp +=lineCount;
            result++;
             if(tmp >= n){
                break;
            }
        }
        System.out.println(result);
        br.close();
    }
}
