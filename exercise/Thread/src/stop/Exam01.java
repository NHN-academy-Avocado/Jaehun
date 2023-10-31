package stop;

public class Exam01 {
    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter("counter", 10);
        Thread thread = new Thread(counter);
        thread.start();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        counter.stop();
        System.out.println("카운터 중단");
    }
}
