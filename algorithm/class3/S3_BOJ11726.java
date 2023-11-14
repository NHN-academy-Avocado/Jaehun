import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_BOJ11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==1){
            System.out.println("1");
            return;
        }
        int[] arr = new int[n+1];
        arr[0]=arr[1]=1;
        for(int i=2; i<=n; i++){
            arr[i]=(arr[i-1]+arr[i-2])%10007;
        }
        System.out.println(arr[n]);
    }
}
