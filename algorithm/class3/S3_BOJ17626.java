import java.util.Scanner;

public class S3_BOJ17626 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        arr[1]=1;
        for(int i=2; i<n+1; i++){
            arr[i] = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++){
                arr[i] = Math.min(arr[i], arr[i - (j * j)]);
            }
            arr[i]+=1;
        }
        System.out.println(arr[n]);
        scan.close();
    }
}

