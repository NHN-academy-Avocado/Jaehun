import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S3_BOJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int qSize = Integer.parseInt(st.nextToken());
            int findIndex = Integer.parseInt(st.nextToken());
            Queue<int[]> que = new LinkedList<int[]>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < qSize; j++) {
                int check = 0;
                if (j == findIndex) {
                    check = 1;
                }
                que.offer(new int[] {Integer.parseInt(st.nextToken()), check});
            }
            int result = 0;

            while (!que.isEmpty()) {
                int[] current = que.poll();
                boolean isMax = true;
                for (int[] other : que) {
                    if (other[0] > current[0]) {
                        isMax = false;
                        break;
                    }
                }
                if (isMax) {
                    result++;
                    if (current[1] == 1) {
                        break;
                    }
                } else {
                    que.offer(current);
                }
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
        br.close();
    }
}