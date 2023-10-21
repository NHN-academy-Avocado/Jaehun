import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Unit8_2 {
    private static final BigInteger THREE = new BigInteger("3");
    private static final BigInteger ONE = new BigInteger("1");
    private static final BigInteger TWO = new BigInteger("2");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        BigInteger n;
        while(true){
            System.out.println("Enter value, if you want to quit just enter");
            line = br.readLine();
            if (line.length() == 0) {
                break;
            }
            try{
                n = new BigInteger(line);
                if(n.signum() ==1){
                    print(n);
                }else{
                    System.out.println("n is under 1");
                }
                }catch(NumberFormatException e){
                    System.out.println(e.getMessage());
            }
        }
        br.close();
        System.out.println("exit");

    }

    private static void print(BigInteger n) {
        assert n != null && n.signum() == 1 : "n is wrong";
        int count=0;
        while (!n.equals(ONE)) {
            if(n.testBit(0)==false){  //짝수
                n = n.divide(TWO);
            }else{
                n = n.multiply(THREE);
                n = n.add(ONE);
            }
            System.out.print(n.toString()+ " " );
            count++;
        }
        System.out.println("\ncount : " + count);
    }
}
