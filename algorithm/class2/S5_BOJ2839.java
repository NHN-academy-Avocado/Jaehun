import java.io.*;
import java.util.*;

public class S5_BOJ2839 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 5) {
            if (n == 3) System.out.println(1);
            else System.out.println(-1);
            return;
        }
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1001);
        arr[3] = arr[5] = 1;
        for (int i = 6; i < arr.length; i++)
            arr[i] = Math.min(arr[i - 3], arr[i - 5]) + 1;


        if (arr[n] > 1001)
            System.out.println(-1);
        else
            System.out.println(arr[n]);
    }
}
