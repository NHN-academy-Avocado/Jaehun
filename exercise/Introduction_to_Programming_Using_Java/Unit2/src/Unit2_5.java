import java.util.Scanner;

public class Unit2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of egg >> ");
        int n = scanner.nextInt();
        int gross = n/144;
        n%=144;
        int dozen = n/12;
        System.out.println("Your number of egg is " + gross + " gross, " + dozen + " dozen, and "+ n%12);
        scanner.close();
    }
}
