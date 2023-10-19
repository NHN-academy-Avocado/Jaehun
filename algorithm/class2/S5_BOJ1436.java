import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_BOJ1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count =0;
        int result = 665;

        while(count<n){
            if(check(++result)){
                count++;
            }
        }
        System.out.println(result);
        br.close();
    }
    public static boolean check(int n){
        char[] arr = Integer.toString(n).toCharArray();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] =='6'){
                count++;
                if(count==3){
                    return true;
                }
            }else{
                count=0;
            }
        }
        return false;
//        return Integer.toString(n).contains("666");
    }
}
