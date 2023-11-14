package homework;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            try {
                store.sell();
                int sleepTime = ThreadLocalRandom.current().nextInt(1, 10) * 4000;
                System.out.println("물건을 납품하고, 다음 납품까지 " + sleepTime/1000 + "초 대기합니다");
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
