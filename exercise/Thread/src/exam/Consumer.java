
package exam;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable {
    private Store store;
    private String name;

    public String getName() {
        return this.name;
    }

    public Consumer(String name, Store store) {
        this.name = name;
        this.store = store;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep((long) (ThreadLocalRandom.current().nextInt(1, 10) * 1000));
                this.store.enter();
                System.out.println(this.name + "이 매장에 들어갑니다.");
                this.store.buy();
                System.out.println(this.name + "이 물건을 구입합니다.");
                this.store.exit();
                System.out.println(this.name + "이 매장에 퇴장합니다.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
