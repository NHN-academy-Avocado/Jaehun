import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_BOJ11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int bitMask = 0;
        StringTokenizer st;
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken()) - 1;
            }
            switch (name) {
                case "add":
                    bitMask |= (1 << num);
                    break;
                case "remove":
                    bitMask &= ~(1 << num);
                    break;
                case "check":
                    sb.append(((bitMask & (1 << num)) == (1 << num)) ? "1\n" : "0\n");
                    break;
                case "toggle":
                    bitMask ^= (1 << num);
                    break;
                case "all":
                    bitMask = (1 << 21) - 1;
                    break;
                case "empty":
                    bitMask = 0;
                    break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}
//
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//        import java.util.StringTokenizer;
//
//public class Main {
//    private static int[] arr = new int[21];
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int m = Integer.parseInt(br.readLine());
//
//        StringTokenizer st;
//        for(int i=0; i<m; i++){
//            st = new StringTokenizer(br.readLine());
//            switch (st.nextToken()) {
//                case "add":
//                    add(Integer.parseInt(st.nextToken()));
//                    break;
//                case "remove":
//                    remove(Integer.parseInt(st.nextToken()));
//                    break;
//                case "check":
//                    check(Integer.parseInt(st.nextToken()), sb);
//                    break;
//                case "toggle":
//                    toggle(Integer.parseInt(st.nextToken()));
//                    break;
//                case "all":
//                    all();
//                    break;
//                case "empty":
//                    empty();
//                    break;
//            }
//        }
//        System.out.println(sb);
//    }
//
//    private static void add(int i) {
//        if(arr[i] ==0){
//            arr[i]=1;
//        }
//    }
//
//    private static void remove(int i) {
//        if(arr[i] ==1){
//            arr[i]=0;
//        }
//    }
//
//    private static void check(int i, StringBuilder sb) {
//        sb.append((arr[i] == 1) ? "1\n" : "0\n");
//
//    }
//
//    private static void toggle(int i) {
//        if(arr[i]==1){
//            arr[i]=0;
//        }else{
//            arr[i]=1;
//        }
//    }
//
//    private static void all() {
//        for(int i=1; i<21; i++){
//            arr[i]=1;
//        }
//    }
//
//    private static void empty() {
//        for(int i=1; i<21; i++){
//            arr[i]=0;
//        }
//    }
//}
