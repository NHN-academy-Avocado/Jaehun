import java.io.*;

public class B1_BOJ2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int[][] arr = new int[15][15];
        for (int i = 0; i < 15; i++) {
            arr[0][i] = i+1;
            arr[i][0] = 1;
        }
        for(int i=1; i<15; i++){
            for(int j=1; j<15; j++)
                arr[i][j]=arr[i][j-1]+arr[i-1][j];
        }
        for (int i = 0; i < t; i++) {
            int count=0;
            int floor = Integer.parseInt(bf.readLine()), ho = Integer.parseInt(bf.readLine())-1;
            for (int j = 0; j <= ho; j++)
                count += arr[floor - 1][j];
            System.out.println(count);
        }
    }
}