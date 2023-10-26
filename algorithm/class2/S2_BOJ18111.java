import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_BOJ18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로
        int b = Integer.parseInt(st.nextToken()); // 인벤토리 블록 수
        int[][] arr = new int[n][m];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int time = Integer.MAX_VALUE, high = -1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) { max = arr[i][j]; }
                if (arr[i][j] < min) { min = arr[i][j]; }
            }
        }
        for (int i = min; i <= max; i++) {
            int block = b;
            int t = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {

                    if (arr[j][k] > i) {
                        int tmp = arr[j][k] - i;
                        t += 2 * tmp;
                        block += tmp;
                    } else if (arr[j][k] < i) {
                        int tmp = i - arr[j][k];
                        t += tmp;
                        block -= tmp;
                    }
                }
            }
            if (block < 0) {
                break;
            }
            if (time >= t) {
                time = t;
                high = i;
            }
        }


        System.out.println(time + " " + high);
        br.close();
    }
}
