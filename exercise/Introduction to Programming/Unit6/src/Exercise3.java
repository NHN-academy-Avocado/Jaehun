public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(factorial(-1));
    }
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("n is negative");
            return 0;
        }else if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
