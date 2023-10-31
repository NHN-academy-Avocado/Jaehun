package stop;

public class Exam02 {
    public static void main(String[] args) {
        ThreadUnlimitedCounter counter = new ThreadUnlimitedCounter("counter");
        Thread thread = new Thread(counter);
        thread.start();
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        thread.interrupt();
        System.out.println("카운터 중단");
    }
}
