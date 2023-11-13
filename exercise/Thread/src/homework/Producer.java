package homework;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private Store store;
    private String produceItem;


    public Producer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            try {
                setRandomProduceItem();
                store.sell(produceItem);
                Thread.sleep(100);
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setRandomProduceItem() {
        produceItem = store.foodList[ThreadLocalRandom.current().nextInt(0, store.getItemNumber())];
    }
}
