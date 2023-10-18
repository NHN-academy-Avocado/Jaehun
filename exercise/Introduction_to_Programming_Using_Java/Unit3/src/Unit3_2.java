public class Unit3_2 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int divisorCount = 0;
        int num=0;
        for (int i = 2; i <= 10000; i++) {
            divisorCount = 0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount > max) {
                max = divisorCount;
                num=i;
            }
        }
        System.out.println(num + " " + max);
    }
}

