package daemon;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        RunnableCounter counter1 = new RunnableCounter("counter1", 100);
        RunnableCounter counter2 = new RunnableCounter("counter2", 100);
        counter2.setDaemon(true);
        counter1.start();
        counter2.start();
        Thread.sleep(5000L);
        counter1.stop();
        System.out.println("main thread terminated");
    }
}
