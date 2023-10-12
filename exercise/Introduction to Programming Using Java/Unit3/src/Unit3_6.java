public class Unit3_6 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int divisorCount = 0;
        int[] arr = new int[10001];
        int index=0;
        for (int i = 2; i <= 10000; i++) {
            divisorCount = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            arr[i] = divisorCount;
            if (divisorCount > max) {
                max = divisorCount;
            }
        }
        System.out.println("약수의 최대 갯수는 " + max);
        System.out.println("이러한 약수의 갯수를 가진 숫자들은:");
        for(int i=2; i<10000; i++){
            if(arr[i]==max) {
                System.out.printf("%8d\n", i);
            }
        }
    }
}
