import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit8_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter Roma String or Num, if you want quit just enter");
            String line = br.readLine();
            char first = line.charAt(0);

            if(line.isEmpty()){
                break;
            }

            if(Character.isDigit(first)){
                int tmp = Integer.parseInt(line);
                try{
                    Roma roma = new Roma(tmp);
                    System.out.println(roma.toInt() + " = " + roma.toString());
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }
            }else{
                String tmp = line;
                try{
                    Roma roma = new Roma(tmp);
                    System.out.println(roma.toString() + " = " + roma.toInt());

                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
