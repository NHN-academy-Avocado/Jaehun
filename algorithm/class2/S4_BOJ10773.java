import java.io.*;
import java.util.Stack;


public class S4_BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int tmp = Integer.parseInt(bf.readLine());
            if (tmp != 0) {
                s.push(tmp);
            } else {
                s.pop();
            }
        }
        while (!s.isEmpty()) {
            sum += s.pop();
        }
        System.out.println(sum);
    }
}