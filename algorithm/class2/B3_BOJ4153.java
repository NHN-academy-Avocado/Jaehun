import java.util.Scanner;
public class B3_BOJ4153 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1=0, n2=0, n3=0;
        while(true){
            n1=scan.nextInt();
            n2=scan.nextInt();
            n3=scan.nextInt();
            if(n1==0&&n2==0&&n3==0)
                break;
            System.out.println(((n1*n1+n2*n2)==n3*n3||(n1*n1+n3*n3)==n2*n2||(n2*n2+n3*n3)==n1*n1)? "right": "wrong");
        }
        scan.close();

    }
}