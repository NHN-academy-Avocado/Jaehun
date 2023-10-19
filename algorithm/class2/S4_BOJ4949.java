import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> st= new Stack<>();
        String line;
        boolean check = false;
        while (true) {
            check = false;
            line = br.readLine();
            if (line.charAt(0) == '.') {
                break;
            }
            for (int i = 0; i < line.length(); i++) {
                char input = line.charAt(i);
                if (input == '[' || input == '(') {
                    st.push(input);
                } else if (input == ']' || input == ')') {
                    if (st.isEmpty()) {
                        check = true;
                        break;
                    }
                    char comp = st.pop();
                    if ((comp == '[' && input != ']') || (comp == '(' && input != ')')) {
                        check = true;
                        break;
                    }
                }
                if((i==line.length()-1)&& !st.isEmpty()){
                    check = true;
                    break;
                }
            }
            sb.append(check ? "no\n" : "yes\n");
            st.clear();
        }
        System.out.println(sb);
        br.close();
    }
}
