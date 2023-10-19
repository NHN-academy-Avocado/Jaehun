import java.util.Scanner;
public class B1_BOJ11050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k=scan.nextInt();
        System.out.println(fact(n)/(fact(n-k)*fact(k)));
        scan.close();
    }
    public static int fact(int num){
        if(num<=1)
            return 1;
        else
            return num*fact(num-1);
    }
}
