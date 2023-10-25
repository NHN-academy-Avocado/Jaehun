import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int index = 1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(tmp >= index) {
                while (tmp >= index) {
                    st.push(index++);
                    sb.append("+\n");
                }
            }
            if(tmp == st.peek()){
                st.pop();
                sb.append("-\n");
            }else{
                sb = new StringBuilder().append("NO");
                break;
            }
        }
        br.close();
        System.out.println(sb);
    }
}
