package thread_class_extension;

public class Quiz2_4 {
    public static void main(String[] args) {
        ThreadCounter threadCounter1 = new ThreadCounter("test1", 4);
        ThreadCounter threadCounter2 = new ThreadCounter("test2", 4);
        threadCounter1.start();
        threadCounter2.start();
    }
//    test1 : 1
//    test2 : 1
//    test1 : 2
//    test2 : 2
//    test2 : 3
//    test1 : 3
//    test2 : 4
//    test1 : 4
}
