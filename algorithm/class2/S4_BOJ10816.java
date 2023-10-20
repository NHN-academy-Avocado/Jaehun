import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S4_BOJ10816 {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int tmp = Integer.parseInt(st.nextToken());
            sb.append((upperBound(arr, tmp) - lowerBound(arr, tmp)) + " ");
        }
        System.out.println(sb.toString());
    }

    private static int lowerBound(int[] array, int n) {
        int start = 0;
        int end = array.length;
        while(start < end){
            int mid = start + (end-start)/2;
            if(n <=array[mid]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    private static int upperBound(int[] array, int n) {
        int start = 0;
        int end = array.length;
        while(start < end){
            int mid = start + (end-start)/2;
            if(n <array[mid]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Integer, Integer> map = new HashMap<>();
//        StringBuilder sb = new StringBuilder();
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<n; i++){
//            int key = Integer.parseInt(st.nextToken());
//            map.put(key, map.getOrDefault(key, 0) + 1);
//        }
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine(), " ");
//        for(int i=0; i<m; i++){
//            int key = Integer.parseInt(st.nextToken());
//            sb.append(map.getOrDefault(key, 0 ) + " ");
//        }
//        System.out.println(sb.toString());
//    }
}

