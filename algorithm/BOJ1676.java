import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger result = BigInteger.ONE;
        int count=0;
        for(int i=1; i<=n; i++){
            result =  result.multiply(BigInteger.valueOf(i));
        }

        while(true){
            if(result.remainder(BigInteger.valueOf(10)) == BigInteger.ZERO){
                count++;
                result = result.divide(BigInteger.valueOf(10));
            }
            if(result.remainder(BigInteger.valueOf(10)) != BigInteger.ZERO){
                break;
            }
        }
        System.out.println(count);

    }

}
