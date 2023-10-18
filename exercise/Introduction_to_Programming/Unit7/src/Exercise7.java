import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5};
        int[] result = removeDuplicates(input);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.print(result[i]);
            }
        }
    }
    public static int[] removeDuplicates(int[] A) {
        int[] result = new int[A.length];
        int count = 1;
        boolean check =false;
        result[0]=A[0];
        for(int i = 1; i<A.length; i++){
            for(int j=0; j<count; j++){
                if(A[i] ==result[j]){
                    check =true;
                    break;
                }else{
                    check = false;
                }
            }
            if(!check){
                result[count++] = A[i];
                }
        }
        return result;
    }
}