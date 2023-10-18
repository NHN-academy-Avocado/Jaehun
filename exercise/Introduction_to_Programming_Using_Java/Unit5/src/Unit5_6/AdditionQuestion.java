package Unit5_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionQuestion {
    private static AdditionQuestion[] questions;
    private static int[] answers;
    private int a, b;  // The numbers in the problem.

    public AdditionQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a + b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        makeQuiz();
        manageQuiz(br);
        checkQuiz();
        br.close();
    }

    private static void makeQuiz() {
       questions = new AdditionQuestion[10];
       answers = new int[10];
       for(int i=0; i<10; i++){
           questions[i] = new AdditionQuestion();
       }
    }

    private static void manageQuiz(BufferedReader brr) throws IOException {
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ": " + questions[i].getQuestion());
            answers[i] = Integer.parseInt(brr.readLine());
        }
    }


    private static void checkQuiz() {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ": " + questions[i].getQuestion()+ " = " + questions[i].getCorrectAnswer());
            if(questions[i].getCorrectAnswer()==answers[i]){
                System.out.println("   OK");
                count++;
            }else{
                System.out.println("   X");
            }
        }
        System.out.println(count*10);
    }

}



