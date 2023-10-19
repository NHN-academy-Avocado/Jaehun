import java.util.Scanner;

public class B2_BOJ2231{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int cons = 0;
        for (int i=0; i<n; i++){
            int tmp=i;
            int sum=0;
            while(tmp!=0){
                sum+=tmp%10;
                tmp/=10;
            }
            if(sum+i==n){
                cons = i;
                break;
            }
        }
        System.out.print(cons);
    }
}