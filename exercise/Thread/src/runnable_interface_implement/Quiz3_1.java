package runnable_interface_implement;

public class Quiz3_1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableCounter("test", 3));
        thread.start();
    }
}
