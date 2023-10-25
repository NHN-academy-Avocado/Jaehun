import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_BOJ1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        long min = 1;
        long mid = 0;
        while (min <=max) {
            mid = (max + min) / 2;
            long count=0;
            for(int i=0; i<k; i++){
                count+=(arr[i]/mid);
            }
            if(count < n){
                max = mid-1;
            }else{
                min= mid+1;
            }

        }

        System.out.println(max);
        System.out.println(min-1);
        br.close();
    }
}