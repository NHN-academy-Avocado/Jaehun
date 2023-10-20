import java.io.*;

public class S4_BOJ10828 {
    private static int n;
    private static int top = -1;
    private static int stk[];

    public static void push(int x) {
        stk[++top] = x;
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("-1");
        } else {
            System.out.println(stk[top--]);
        }
    }

    public static void size() {
        System.out.println(top + 1);
    }

    public static void empty() {
        if (top == -1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void top() {
        if (top == -1) {
            System.out.println("-1");
        } else {
            System.out.println(stk[top]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        stk = new int[n];
        for (int i = 0; i < n; i++) {
            String[] s = bf.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    push(Integer.parseInt(s[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }
    }
}