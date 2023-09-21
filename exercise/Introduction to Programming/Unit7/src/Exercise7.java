import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5};
        Arrays.sort(input);
        int[] result = removeDuplicates(input);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.print(result[i]);
            }
        }
    }

    public static int[] removeDuplicates(int[] A) {
        int[] result = new int[A.length];
        int index = 0;
        for(int i = 0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i] ==A[j]){
                    result[index++];
                    break;
                }
            }
        }
        return result;
    }
}