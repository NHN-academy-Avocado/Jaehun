public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(pi(2));
    }
    public static double pi(int n){
        double result = 0;
        int sign =1;
        for(int i=0; i<n; i++){
            result += sign*(4/(2*i+1d));
            sign*=-1;
        }
        return result;
    }
}
