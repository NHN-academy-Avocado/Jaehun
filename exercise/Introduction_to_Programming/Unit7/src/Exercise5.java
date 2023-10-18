public class Exercise5 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {1,2,3,4,5};
        System.out.println(equalArrays(A,B));
    }
    public static boolean equalArrays(int[] A, int [] B){
        if(A.length != B.length){
            return false;
        }
        int j=0;
        for(int i: A){
            if(i != B[j++]){
                return false;
            }
        }
        return true;
    }
}
