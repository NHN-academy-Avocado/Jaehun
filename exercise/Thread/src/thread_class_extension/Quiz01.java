package thread_class_extension;

public class Quiz01 {
    public static void main(String[] args) {
        Counter counter = new Counter("test", 5);
        counter.run();
    }
}
