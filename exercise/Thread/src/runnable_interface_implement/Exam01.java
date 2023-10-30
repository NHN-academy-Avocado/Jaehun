package runnable_interface_implement;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException{
        RunnableCounter counter = new RunnableCounter("counter", 5);
        Thread thread = new Thread(counter);
        thread.start();
    }
}
