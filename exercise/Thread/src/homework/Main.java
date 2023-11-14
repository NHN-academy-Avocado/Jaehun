package homework;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] items = {"사과", "바나나", "딸기"};
        Store store = new Store(items);
        Thread producer = new Thread(new Producer(store));
        producer.start();
        Thread[] consumers = new Thread[10];

        for(int i = 0; i < 10; ++i) {
            consumers[i] = new Thread(new Consumer("consumer" + (i + 1), store));
            consumers[i].start();
        }
    }
}
