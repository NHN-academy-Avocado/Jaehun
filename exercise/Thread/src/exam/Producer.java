package exam;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (ThreadLocalRandom.current().nextInt(1, 10) * 1000));
                store.sell();
                System.out.println("물건이 추가되었습니다");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
