import java.io.*;

public class S3_BOJ1929{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] ss= bf.readLine().split(" ");
        int m= Integer.parseInt(ss[0]);
        int n= Integer.parseInt(ss[1]);
        int[] arr = new int[n+1];
        for(int i=2; i<=n; i++) arr[i]=i;

        for(int i=2; i<=n; i++){
            if(arr[i]==0) continue;
            for(int j=i*2; j<=n; j+=i)
                arr[j]=0;
        }
        for(int i=m; i<=n; i++)
            if(arr[i]!=0)
                System.out.println(i);
    }
}