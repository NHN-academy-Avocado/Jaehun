import java.util.Scanner;

public class Unit2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name >> ");
        String name = scanner.next();
        String result="";
        for(int i=0; i<name.length(); i++){
            int tmp = name.charAt(i);
            if(tmp>=65 && tmp<=90){
                result += (char)tmp;
            }else if(tmp>=97 && tmp<=122){
                result += (char)(tmp-32);
            }
        }
        System.out.println("Hello, " + result + ", nice to meet you!");
        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");
        scanner.close();
    }
}
