public class Exercise2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 5, 6};
        int[] B = {2, 3, 4, 5, 6};
        int[] answer = intersection(A, B);
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                System.out.println(answer[i]);
            }
        }
    }

    public static int[] intersection(int[] A, int[] B) {
        int len = (A.length > B.length) ? A.length : B.length;
        int[] result = new int[len];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    result[index++] = A[i];
                }
            }
        }
        return result;
    }
}
