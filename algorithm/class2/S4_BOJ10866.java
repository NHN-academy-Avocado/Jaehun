import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_BOJ10866 {
    private static int top = -1;
    private static int[] arr;

    private static void push_front(int x) {
        for (int i = ++top; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
    }

    private static void push_back(int x) {
        arr[++top] = x;
    }

    private static void pop_front() {
        int tmp = arr[0];
        if (top == -1) {
            System.out.println("-1");
            return;
        } else {
            for (int i = 0; i < top; i++) {
                arr[i] = arr[i + 1];
            }
        }
        top--;
        System.out.println(tmp);
    }

    private static void pop_back() {
        if (top == -1) {
            System.out.println("-1");
        } else {
            int tmp = arr[top--];
            System.out.println(tmp);
        }
    }

    private static void empty() {
        if (top == -1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static void size() {
        if (top == -1) {
            System.out.println("0");
        } else {
            System.out.println(top + 1);
        }
    }

    private static void front() {
        if (top == -1) {
            System.out.println("-1");
        } else {
            System.out.println(arr[0]);
        }
    }

    private static void back() {
        if (top == -1) {
            System.out.println("-1");
        } else {
            System.out.println(arr[top]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxSize = Integer.parseInt(br.readLine());
        arr = new int[maxSize];
        StringTokenizer st;
        for (int i = 0; i < maxSize; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
        br.close();
    }


}