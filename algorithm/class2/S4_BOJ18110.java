import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S4_BOJ18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int del = (int) Math.round(n * 0.15);
        int[] arr2 = Arrays.copyOfRange(arr, del, (n - del));
        System.out.println(checkLevel(arr2));
        br.close();
    }

    private static int checkLevel(int[] arr) {
        int sum=0;
        int size = arr.length;
        for(int i=0; i<size; i++){
            sum+=arr[i];
        }

        return (int)Math.round((double)sum/size);
    }
}
