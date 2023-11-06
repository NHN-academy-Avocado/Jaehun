package daemon;

public class RunnableCounter implements Runnable {
    Thread thread;
    int count = 0;
    int maxCount;
    long interval = 1000;

    public RunnableCounter(String name, int maxCount) {
        this.thread = new Thread(this, name);
        this.maxCount = maxCount;
    }

    public void increment() {
        count++;
    }

    public void start() {
        thread.start();
    }

    public void stop() {
        thread.interrupt();
    }

    public void setDaemon(boolean on) {
        thread.setDaemon(on);
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    public void run() {
        try {
            while (count < maxCount) {
                increment();
                System.out.println(thread.getName() + " : " + this.count);
                Thread.sleep(interval);
            }
        } catch (InterruptedException ignore) {
            Thread.currentThread().interrupt();
        }
    }
}
