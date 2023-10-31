package synchronization.exam01;

public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        SharedCount sharedCount = new SharedCount();
        SharedCounter counter1 = new SharedCounter("counter1", 10000, sharedCount);
        SharedCounter counter2 = new SharedCounter("counter2", 10000, sharedCount);

        counter1.start();
        counter2.start();
        System.out.println(counter1.getName() + ": started");
        System.out.println(counter2.getName() + ": started");


        counter1.join();  // join을 해야 main 쓰레드가 counter1이 완전히 실행될때 까지 대기한다
        // 그래야 sharedCount.getCount()가 잘 나온다
        counter2.join();
        System.out.println(counter1.getName() + ": terminated");
        System.out.println(counter2.getName() + ": terminated");
        System.out.println("sharedCount : " + sharedCount.getCount());
    }
}
