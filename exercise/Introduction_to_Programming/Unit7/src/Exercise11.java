public class Exercise11 {
    public static void main(String[] args) {
        int[][] input = {{1,0,0,0}, {0,9,0,0}, {0,0,9,0}, {0,0,0,7}};
        System.out.println(diagonal(input));
    }
    public static boolean diagonal(int[][] M){
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[0].length; j++){
                if((i!=j) && M[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
}
