import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr= new int[n][2];
        String[] st = new String[2];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            st = br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(st[0]);
            arr[i][1]=Integer.parseInt(st[1]);
        }

        int count=1;

        for(int i=0; i<n; i++){
            count=1;
            for(int j=0; j<n; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    count++;
                }
            }
            sb.append(count+ " ");
        }

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
