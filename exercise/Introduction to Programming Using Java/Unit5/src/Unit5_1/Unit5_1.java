package Unit5_1;

public class Unit5_1 {
    public static void main(String[] args) {
        PairOfDice pod = new PairOfDice();
        int count = 1;
        while(true){
            if(pod.sum()==2)
                break;
            pod.roll();
            count++;
        }
        System.out.println(count);
    }
}
