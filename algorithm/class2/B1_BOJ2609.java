import java.util.Scanner;

public class B1_BOJ2609 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt(), n2= scan.nextInt();
        scan.close();
        int max_div=0, tmp = (n1<n2)? n1: n2;
        for(int i=1; i<=tmp; i++)
            if(n1%i==0 && n2%i ==0)
                max_div = i;
        int min_mul=n1*n2/max_div;
        System.out.print(max_div +"\n" + min_mul);
    }
}