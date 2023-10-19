import java.io.*;
import java.util.*;

public class S5_BOJ1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arrn = new int[Integer.parseInt(bf.readLine())];
        StringTokenizer st=new StringTokenizer(bf.readLine());
        for(int i=0; i<arrn.length; i++)
            arrn[i]= Integer.parseInt(st.nextToken());
        Arrays.sort(arrn);

        int m = Integer.parseInt(bf.readLine());
        st=new StringTokenizer(bf.readLine());

        for(int i=0; i<m; i++)
            System.out.println(bin(arrn,Integer.parseInt(st.nextToken())));
    }
    public static int bin(int[] arr, int tmp){
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==tmp) return 1;
            else if(tmp>arr[mid]) low = mid+ 1;
            else if(tmp<arr[mid]) high = mid -1;
        }
        return 0;
    }
}