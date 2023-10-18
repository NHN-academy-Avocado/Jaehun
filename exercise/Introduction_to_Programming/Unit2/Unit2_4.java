import java.util.Scanner;

public class Unit2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.substring(s.length()-1, s.length()) + s.substring(1,s.length()-1) + s.substring(0, 1);
        System.out.println(s);
        scanner.close();
    }    
}
