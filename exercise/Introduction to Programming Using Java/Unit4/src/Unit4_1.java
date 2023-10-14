import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit4_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(printCapitalized(line));
        br.close();
    }
    static String printCapitalized(String s) {
        String answer = "";
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                check = true;
            }
            if (check) {
                answer += Character.toUpperCase(s.charAt(i));
                check = false;
            } else {
                answer += (char) (s.charAt(i));
            }
        }
        return answer;
    }
}
