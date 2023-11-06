package exam;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws InterruptedException {
        Store store = new Store();
        Thread producer = new Thread(new Producer(store));
        producer.start();
        Thread[] consumers = new Thread[10];

        for(int i = 0; i < 10; ++i) {
            consumers[i] = new Thread(new Consumer("consumer" + (i + 1), store));
            consumers[i].start();
        }

        Thread.sleep(10000L);
        producer.interrupt();

        for (Thread consumer : consumers) {
            consumer.interrupt();
        }

    }
}
