import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit4_8 {
    private static int[] first;
    private static int[] second;
    private static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        makeQuiz();
        manageQuiz(br);
        checkQuiz();
        br.close();
    }

    private static void makeQuiz() {
        first = new int[10];
        second = new int[10];
        answer = new int[10];
        for (int i = 0; i < 10; i++) {
            first[i] = (int) (Math.random() * 10 + 1);
            second[i] = (int) (Math.random() * 10 + 1);
        }
    }

    private static void manageQuiz(BufferedReader brr) throws IOException {
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ": " + first[i] + " + " + second[i] + " =  ? >> ");
            answer[i] = Integer.parseInt(brr.readLine());
        }
    }


    private static void checkQuiz() {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = first[i] + second[i];
            System.out.print((i+1) + ": " + first[i] + " + " + second[i] + " = " + answer[i]);
            if(sum==answer[i]){
                System.out.println("   OK");
                count++;
            }else{
                System.out.println("   X");
            }
        }
        System.out.println(count*10);
    }
}
