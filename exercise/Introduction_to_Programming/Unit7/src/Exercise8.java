public class Exercise8 {
    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 == 1)
                x++;
        return x;
    }
    // 배열 A에서 홀수인 값의 개수
}
