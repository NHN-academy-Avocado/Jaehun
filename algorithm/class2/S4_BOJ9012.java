import java.io.*;
import java.util.Stack;

public class S4_BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            String s = bf.readLine();
            Stack<Character> sc = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    sc.push(s.charAt(j));
                } else if (sc.empty()) {
                    sc.push(s.charAt(j));
                    break;
                } else {
                    sc.pop();
                }
            }
            System.out.println((sc.empty()) ? "YES" : "NO");
        }
    }
}