import java.util.Scanner;
public class B2_BOJ1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean check = false;
            int tmp = scan.nextInt();
            if (tmp == 1)
                check = true;
            for (int j = 2; j < tmp; j++) {
                if (tmp % j == 0)
                    check = true;
            }
            if (check == false) count++;
        }
        System.out.println(count);
        scan.close();
    }
}