public class Exercise3 {
    public static void main(String[] args) {
        double[][] d = {{1,2,3}, {4,5,6},{7,8,9}};
        double[][] answer = transposeMatrix(d);
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                System.out.print(answer[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static double[][] transposeMatrix(double[][] M){
        double[][] result = new double[M.length][M[0].length];
        for(int i=0; i<M[0].length; i++){
            for(int j=0; j<M.length; j++){
                result[j][i] = M[i][j];
            }
        }
        return result;
    }
}
