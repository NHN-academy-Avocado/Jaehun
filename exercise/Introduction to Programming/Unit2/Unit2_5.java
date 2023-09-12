import java.util.Scanner;

public class Unit2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer s = new StringBuffer(scanner.nextLine());
        s.insert(1,s.substring(s.length()-1, s.length()));
        s.delete(s.length()-1, s.length());
        s.insert(s.length(), s.substring(0,1));
        s.delete(0, 1);
        System.out.println(s);
        scanner.close();
    }   
}
