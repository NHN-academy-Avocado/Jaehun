public class Exercise9 {
    public static void main(String[] args) {
        int[][] input = {{1,2}, {0,1}};
        System.out.println(symmetric(input));
        int[][] input2 = {{1,2,3,4}, {2,9,6,5}, {3,6,10,8}, {4,5,8,7}};
        System.out.println(symmetric(input2));
    }
    public static boolean symmetric(int[][] M){
        if(M.length != M[0].length){
            return false;
        }
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[0].length; j++){
                if(M[i][j] != M[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
