public class Exercise6 {
   public static void main(String[] args) {
    int[] input = {1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5};
    System.out.println(numberOfDistinctValues(input));
    System.out.println(numberOfDuplicates(input));
   }
   public static int numberOfDuplicates(int[] A){
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
    return count;
}
   
   public static int numberOfDistinctValues(int[] A){
       return A.length- numberOfDuplicates(A);
   }
}
