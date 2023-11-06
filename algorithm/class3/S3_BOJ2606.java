import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S3_BOJ2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int setNum = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n + 1][n + 1];
        boolean[] check = new boolean[n + 1];
        Stack<Integer> stack = new Stack<>();
        int result = -1;
        StringTokenizer st;
        for (int i = 0; i < setNum; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            matrix[a][b] = matrix[b][a] = 1;
        }
        stack.push(1);
        while (!stack.empty()) {
            int tmp = stack.pop();
            if (check[tmp]) {
                continue;
            }
            check[tmp] = true;
            result++;
            for (int i = n; i >= 1; i--) {
                if (!check[i] && matrix[tmp][i] != 0) {
                    stack.push(i);
                }
            }
        }
        System.out.println(result);
    }
}
