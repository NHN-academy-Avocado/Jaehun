import java.util.Scanner;

public class Unit2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quarter >> ");
        int quarter = scanner.nextInt();
        System.out.print("Enter dime >> ");
        int dime = scanner.nextInt();
        System.out.print("Enter nickel >> ");
        int nickel = scanner.nextInt();
        System.out.print("Enter penny >> ");
        int penny = scanner.nextInt();
        double sum = quarter*(0.25)+dime*(0.1)+nickel*(0.05)+penny*(0.01);
        System.out.printf("%1.2f" ,sum);
        scanner.close();
    }
}
