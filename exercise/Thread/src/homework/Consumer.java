
package homework;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    private Store store;
    private String itemName;


    public Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (ThreadLocalRandom.current().nextInt(1, 10) * 1000));
                this.store.enter();
//                System.out.println(this.name + "이 매장에 들어갑니다.");

                setRandomWantItem();
                this.store.buy(itemName);
//                System.out.println(this.name + "이 " + itemName  + "을 구입합니다.");

                this.store.exit();
//                System.out.println(this.name + "이 매장에 퇴장합니다.");
                Thread.sleep((long) (ThreadLocalRandom.current().nextInt(1, 10) * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void setRandomWantItem() {
        itemName = store.foodList[ThreadLocalRandom.current().nextInt(0, store.getItemNumber())];
    }
}
