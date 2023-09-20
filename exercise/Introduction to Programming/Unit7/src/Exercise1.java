public class Exercise1 {
    public static void main(String[] args) {
        double[] A = {1,2,3};
        double[] B = {3,2,1};
        System.out.println(scalarProduct(A,B));
    }
    public static double scalarProduct(double[] A, double[] B){
        double result = 0.0;
        for(int i=0; i<A.length; i++){
            result += A[i]*B[i];
        }
        return result;
    }
}
