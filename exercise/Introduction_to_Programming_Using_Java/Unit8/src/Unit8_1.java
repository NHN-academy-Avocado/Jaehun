import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit8_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c;
        boolean check = false;
        while(!check){
            System.out.println("Enter a b c");
            String[] s = br.readLine().split(" ");
            a = Double.valueOf(s[0]);
            b = Double.valueOf(s[1]);
            c = Double.valueOf(s[2]);
            try{
                System.out.println(root(a,b,c));
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());

            }

            check = Boolean.valueOf(br.readLine());
        }
    }

    static public double root(double A, double B, double C)
            throws IllegalArgumentException {
        if (A == 0) {
            throw new IllegalArgumentException("A can't be zero.");
        } else {
            double disc = B * B - 4 * A * C;
            if (disc < 0) {
                throw new IllegalArgumentException("Discriminant < zero.");
            }
            return (-B + Math.sqrt(disc)) / (2 * A);
        }
    }
}
