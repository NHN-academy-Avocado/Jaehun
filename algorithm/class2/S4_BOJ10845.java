import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_BOJ10845 {
    private static int index = -1;
    private static int[] arr;

    public static void push(int x) {
        arr[++index] = x;
    }

    public static void pop() {
        if (index == -1) {
            System.out.println("-1");
        } else {
            System.out.println(arr[0]);
            for(int i=0; i<index; i++){
                arr[i] =  arr[i+1];
            }
            index--;
        }
    }

    public static void size() {
        System.out.println(index+1);
    }

    public static void empty() {
        System.out.println((index == -1) ? "1" : "0");
    }

    public static void front() {
        System.out.println((index == -1) ? "-1" : arr[0]);
    }

    public static void back() {
        System.out.println((index == -1) ? "-1" : arr[index]);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxSize = Integer.parseInt(br.readLine());
        arr = new int[maxSize];
        StringTokenizer st;
        for (int i = 0; i < maxSize; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
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

