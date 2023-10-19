
import java.util.Scanner;

public class B1_BOJ1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double [] arr = new double[n];
        double max=0, sum=0;

        for(int i=0; i<n; i++)  {
            arr[i]=scan.nextInt();
            if(arr[i]>max)
                max = arr[i];
        }

        for(int i=0; i<n; i++)
            sum+=(arr[i]/max*100);

        System.out.println(sum/n);
        scan.close();
    }
}