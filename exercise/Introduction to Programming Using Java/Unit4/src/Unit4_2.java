import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int result = 0;
        for(int i=0; i<line.length(); i++){
            int value = hexValue(line.charAt(i));
            if(value ==-1){
                System.out.println("-1");
                return;
            }
            result = 16*result + value;
        }
        System.out.println(result);
    }
    static int hexValue(char c){
        switch (c){
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
            case 'a':
                return 10;
            case 'B':
            case 'b':
                return 11;
            case 'C':
            case 'c':
                return 12;
            case 'D':
            case 'd':
                return 13;
            case 'E':
            case 'e':
                return 14;
            case 'F':
            case 'f':
                return 15;
            default:
                return -1;
        }
    }
}
