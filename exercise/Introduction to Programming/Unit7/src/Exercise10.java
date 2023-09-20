public class Exercise10 {
    public static void main(String[] args) {
        int[][] input = {{1,0,0,0}, {2,9,0,0}, {3,6,10,0}, {4,5,8,7}};
        System.out.println(lowerTriangular(input));
    }
    public static boolean lowerTriangular(int[][] M){
        for(int i=0; i<M.length; i++){
            for(int j=i+1; j<M[0].length; j++){
                if(M[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
