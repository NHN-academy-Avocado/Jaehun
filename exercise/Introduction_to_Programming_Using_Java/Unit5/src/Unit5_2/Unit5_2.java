package Unit5_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StatCalc calc = new StatCalc();
        double n = 1;
        while(n!=0){
            System.out.print("Enter a num : >> ");
            n = Double.parseDouble(br.readLine());
            if(n!=0) {
                calc.enter(n);
            }
        }
        System.out.println("Count: " + calc.getCount());
        System.out.println("Sum: " + calc.getSum());
        System.out.println("Avg: " + calc.getMean());
        System.out.println("StandardDeviation: " + calc.getStandardDeviation());
        System.out.println("Min: " + calc.getMin());
        System.out.println("Max: " + calc.getMax());
    }
}
