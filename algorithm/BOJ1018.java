import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1018 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = String.valueOf((char) br.read());
            }
            br.readLine();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int result = reDrawCount(arr, i, j);
                if (result < min) {
                    min = result;
                }
            }
        }
        System.out.println(min);

    }

    public static int reDrawCount(String[][] arr, int w, int h) {
        int min = Integer.MAX_VALUE, count = 0;
        String[] firstW = {"W", "B", "W", "B", "W", "B", "W", "B"};
        String[] firstB = {"B", "W", "B", "W", "B", "W", "B", "W"};

        String[] checkArr = new String[8];
        checkArr = firstW;
        for (int check = 0; check < 2; check++) {
            for (int i = w; i < w + 8; i++) {
                int index = 0;
                for (int j = h; j < h + 8; j++) {
                    if (!arr[i][j].equals(checkArr[index++])) {
                        count++;
                    }

                }
                checkArr = Arrays.equals(checkArr, firstW) ? firstB : firstW;
            }
            if (check == 0) {
                min = count;
            }
            checkArr = firstB;
        }
        return min;
    }
}