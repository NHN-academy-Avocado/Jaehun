import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2_BOJ1260 {
    private static int[][] arr;
    private static boolean[] visited;
    private static StringBuilder sb;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(v);
        sb.append("\n");
        visited = new boolean[n + 1];
        bfs(v);
        System.out.println(sb);
        br.close();
    }

    private static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
        for (int j = 1; j <= n; j++) {
            if (arr[start][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v] = true;
        while (!q.isEmpty()) {
            int tmp = q.poll();
            sb.append(tmp).append(" ");
            for (int j = 1; j <= n; j++) {
                if (arr[tmp][j] == 1 && !visited[j]) {
                    q.offer(j);
                    visited[j] = true;
                }
            }
        }
    }
}
