public class Unit3_3 {
    public static void main(String[] args) {

        while (true) {
            double a = TextIO.getDouble();
            if(a==0){
                break;
            }
            char op = TextIO.getChar();
            double b = TextIO.getDouble();
            switch(op){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
            }
        }
    }
}
