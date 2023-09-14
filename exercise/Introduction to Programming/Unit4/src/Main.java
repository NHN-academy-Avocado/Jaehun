import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
//        System.out.println(convertLireEuro(1000));              // Exercise 4.1
//        System.out.println(sumOverflow((byte)64,(byte)64));       // Exercuse 4.2
//        int a = Integer.parseInt(JOptionPane.showInputDialog("Insert a integer number"));
//        int b = Integer.parseInt(JOptionPane.showInputDialog("Insert a integer number"));
//        System.out.println("arithmetic mean: " + (a+b)/2 + ", geometric mean: "+ Math.sqrt(a*b) + ", greater: " + Math.max(a,b) + ", smaller: " + Math.min(a,b));       // Exercuse 4.3
//        short x= 22;                           // Exercuse 4.5
//        byte y = (byte)x;                      // x를 byte형으로 명시적 형변환 필요, 정밀도 손실 가능
//        System.out.println(y);
        System.out.println(lastCharacter("abc"));
    }

    public static double convertLireEuro(int x) {                  // Exercise 4.1
        //input Lire, return Euro
        final double LIREtoEURO = 0.0345323842017;
        return Math.round(x * LIREtoEURO * 100.0) / 100.0;
    }
    public static boolean sumOverflow(byte x, byte y) { // Exercuse 4.2
        short a = x;
        short b = y;
//        System.out.println((byte)(x+y));
//        System.out.println((short)(a+b));
        return ((short) (a + b)) != (byte) (x + y);
    }
    public static boolean even(long x){             // Exercuse 4.4
        return (x%2==0);
    }
    /*public void Exercise67() {     // Exercise 4.6,7
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean b1, b2;
        1. b + 10L byte + long =long ;
        2. (b + i) ^ l( byte + int)=int,int*long =long ;
        3. (b + i) * l + f long + float =float ;
        4. s / f + Math.sin(f) int + double =double ;
        5. c == 'b' boolean ;
        6. l + 1.5f long + float =float ;
        7. i < 10 boolean ;
        8. b1 == (f >= 5.0) boolean ;
        9. b1 && !b2 boolean ;

        1. s = 65L              Error발생
        2. f = i + 100;
        3. i = 2*b + l;         Error발생
        4. b1 = s;              Error발생
        5. b2 = s >= 57;
        6. c = b;               Error발생
        7. c = 'b';
    }*/
    public static char lastCharacter(String s){
        return s.charAt(s.length()-1);
    }

}
