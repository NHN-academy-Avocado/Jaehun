package Unit5_7;

import Unit5_6.AdditionQuestion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit5_7 {
    private static IntQuestion[] questions;
    private static int[] answers;
    public static class AdditionQuestion implements IntQuestion{
        private int a,b;
        public AdditionQuestion() { // constructor
            a = (int)(Math.random() * 50 + 1);
            b = (int)(Math.random() * 50);
        }
        @Override
        public String getQuestion() {
            return "What is " + a + " + " + b + " ?";
        }

        @Override
        public int getCorrectAnswer() {
            return a + b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        makeQuiz();
        manageQuiz(br);
        checkQuiz();
        br.close();
    }

    private static void makeQuiz() {
        questions = new IntQuestion[10];
        answers = new int[10];

        for(int i=0; i<9; i++){
            questions[i] = new AdditionQuestion();
        }
        questions[9]= new IntQuestion() {
            @Override
            public String getQuestion() {
                return "What is the answer to the ultimate question " +
                        "of life, the universe, and everything?";
            }

            @Override
            public int getCorrectAnswer() {
                return 42;
            }
        };
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
