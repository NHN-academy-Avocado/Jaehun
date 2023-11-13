package homework;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Thread producer = new Thread(new Producer(store), "생산자");
        producer.start();
        Thread[] consumers = new Thread[10];

        for(int i = 0; i < 10; ++i) {
            consumers[i] = new Thread(new Consumer(store),"소비자" + (i + 1) );
            consumers[i].start();
        }
    }
}