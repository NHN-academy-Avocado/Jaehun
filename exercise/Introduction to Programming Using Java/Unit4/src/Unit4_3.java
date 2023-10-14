public class Unit4_3 {
    public static void main(String[] args) {
        System.out.println(dice(3));
    }

    static int dice(int n) {
        if (n < 2 || n > 12) {
            throw new IllegalArgumentException("error");
        }
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int count = 1;
        if((dice1+dice2)==2){
            return count;
        }
        while ((dice1 + dice2) != n) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            count++;
        }
        return count;
    }
}
