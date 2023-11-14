
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
                int sleepTime = ThreadLocalRandom.current().nextInt(1, 10) * 1000;

                this.store.enter();
                Thread.sleep(sleepTime);

                this.store.buy();
                System.out.println(this.name + "이 물건을 구입합니다.");
                this.store.exit();
                System.out.println(this.name + "이 매장에 퇴장합니다.");
                System.out.println(this.name + "가 다음 구매까지 " + sleepTime/1000 + "초 대기합니다.");
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
