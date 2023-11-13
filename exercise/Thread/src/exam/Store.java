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
    }

    public synchronized void exit() {
        consumer--;
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
        notifyAll();
    }
}
