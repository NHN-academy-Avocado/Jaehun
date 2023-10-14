public class Unit4_4 {
    public static void main(String[] args) {
        System.out.println("주사위의 총합       평균 굴림 횟수 ");
        System.out.println("----------       ----------");
        for(int i=2; i<=12; i++){
            System.out.printf("%5d%20.4f\n", i, testing(i));
        }
    }
    static double testing(int n){
        double avg=0.0;
        int tmp=0;
        for(int i=0; i<10000; i++){
            tmp +=Unit4_3.dice(n);
        }
        avg = (double)tmp/10000;
        return avg;
    }
}
