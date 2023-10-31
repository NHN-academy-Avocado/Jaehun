package runnable_interface_implement;

public class Exam02 {
    public static void main(String[] args) {
        SelfRunnableCounter counter = new SelfRunnableCounter("counter", 5);
        counter.start();
        System.out.println("main exit");
    }
}
