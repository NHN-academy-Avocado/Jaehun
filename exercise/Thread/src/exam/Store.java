package exam;

public class Store {
    private static final int MAX_ITEM = 10;
    private static final int MAX_CONSUMER = 5;
    private int item = 0;
    private int consumer = 0;

    public int getItem() {
        return this.item;
    }

    public int getConsumer() {
        return this.consumer;
    }

    public synchronized void enter() {
        while(this.consumer >= MAX_ITEM) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        consumer++;
        System.out.println("고객 입장. 현재 매장 내 고객 수: " + consumer);
        notifyAll();
    }

    public synchronized void exit() {
        consumer--;
        System.out.println("고객 퇴장. 현재 매장 내 고객 수: " + consumer);

        notifyAll();
    }

    public synchronized void buy() throws InterruptedException {
        while(this.item == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        item--;
        System.out.println("물건 구매. 남은 물건 수: " + item);
        notifyAll();
    }

    public synchronized void sell() {
        while(this.item >= MAX_CONSUMER) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        item=MAX_ITEM;
        System.out.println("물건 입고. 매장 내 물건 수 : " + item);
        notifyAll();
    }
}
