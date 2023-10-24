import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S3_BOJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        arr[0] = Integer.parseInt(br.readLine());
        int sum = arr[0], min = arr[0], max = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        Arrays.sort(arr);
        int a = (int) Math.round((double) sum / n);
        int b = arr[n / 2];
        int c = arr[0];


        int count = 0;
        max = -1;
        boolean check = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
                c = arr[i];
                check = true;
            } else if (max == count && check) {
                c = arr[i];
                check = false;
            }
        }
        int d = Math.abs(max - min);
        sb.append(a + "\n" + b + "\n" + c + "\n" + d + "\n");
        System.out.println(sb);
        br.close();
    }
}
