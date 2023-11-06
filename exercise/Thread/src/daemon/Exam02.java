package daemon;

public class Exam02 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker1 = new Worker("worker1", 100);
        worker1.start();
        Thread.sleep(5000L);
        worker1.stop();
        System.out.println("main thread terminated");
    }
}
