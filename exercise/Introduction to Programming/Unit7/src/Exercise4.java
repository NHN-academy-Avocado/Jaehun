public class Exercise4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int[] answer = matrixSumColumns(arr);
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }
    public static int[] matrixSumColumns(int[][] arr){
        int[] result = new int[arr[0].length];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                result[i] += arr[j][i];
            }
        }
        return result;
    }
}
