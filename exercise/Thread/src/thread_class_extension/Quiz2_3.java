package thread_class_extension;

public class Quiz2_3 {
    public static void main(String[] args) {
        Counter counter1 = new Counter("test1", 5);
        Counter counter2 = new Counter("test2", 5);
        counter1.run();
        counter2.run();
    }
    // counter1의 실행이 종료되고 counter2가 실행된다
//    test1 : 1
//    test1 : 2
//    test1 : 3
//    test1 : 4
//    test1 : 5
//    test2 : 1
//    test2 : 2
//    test2 : 3
//    test2 : 4
//    test2 : 5
}
