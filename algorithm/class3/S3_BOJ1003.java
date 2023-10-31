import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_BOJ1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[1][1] = 1;

        int t = Integer.parseInt(br.readLine());
        for (int i = 2; i < 41; i++) {
//            arr[i][0] = arr[i - 1][0] + arr[i - 2][0];
//            arr[i][1] = arr[i - 1][1] + arr[i - 2][1];
            arr[i][0] = arr[i - 1][1];
            arr[i][1] = arr[i - 1][0] + arr[i - 1][1];
        }
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n][0]).append(" ").append(arr[n][1]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
