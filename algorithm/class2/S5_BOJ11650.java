import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class S5_BOJ11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[Integer.parseInt(bf.readLine())][2];
        for (int i = 0; i < arr.length; i++) {
            String[] s = bf.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]? o1[0]-o2[0] : o1[1]-o2[1];
            }
        });


        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i][0] + " " + arr[i][1]);
    }
}