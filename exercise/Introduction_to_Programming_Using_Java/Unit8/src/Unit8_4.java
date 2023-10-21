import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit8_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Expr expr;
        double n;
        double result;
        System.out.println("Expr functioon");

        while (true) {
            System.out.println("Enter f(x) method, if you want quit just enter");
            line = br.readLine();
            if (line.length() == 0) {
                break;
            }
            try {
                expr = new Expr(line);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
            while (true) {
                System.out.println("Enter x value, in f(x)");
                line = br.readLine();
                if (line.length() == 0){
                    break;
                }
                try{
                    n = Double.parseDouble(line);
                }catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                    continue;
                }
                result = expr.value(n);
                if(Double.isNaN(result)){
                    System.out.println("f(" + n + ") is undefined.");
                }else{
                    System.out.println("f(" + n + ") = " + result);
                }
            }
        }
        System.out.println("exit");
        br.close();
    }
}
