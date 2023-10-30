package thread_class_extension;

public class Quiz2_2 {
    public static void main(String[] args) {
        ThreadCounter threadCounter = new ThreadCounter("test", 4);
        threadCounter.start();
    }
}
