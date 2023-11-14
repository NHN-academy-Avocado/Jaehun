import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_BOJ9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[1]=arr[2]=arr[3]=1;
        arr[4]=arr[5]=2;
        for (int i = 0; i < 96; i++) {
            arr[i + 5] = arr[i] + arr[i + 4];
        }
        while (t-- > 0) {
            sb.append(arr[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}
