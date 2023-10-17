import Unit5_1.PairOfDice;
import Unit5_2.StatCalc;
public class Unit5_3 {
    private static PairOfDice dice = new PairOfDice();
    public static void main(String[] args) {
        System.out.println("주사위의 총합       평균 굴림 횟수    표준편차       최대 롤 수");
        System.out.println("----------       ----------    --------     ----------");
        StatCalc stat;
        for(int i=2; i<=12; i++){
            stat = new StatCalc();
            for(int j=0; j<10000; j++){
                stat.enter(check(i));
            }
            System.out.printf("%5d%20.4f%13.4f%14.4f\n", i, stat.getMean(),stat.getStandardDeviation(), stat.getMean());
        }
    }
    public static int check(int i){
        int result = 1;
        dice.roll();
        while(dice.sum() != i){
            dice.roll();
            result++;
        }
        return result;
    }
}
