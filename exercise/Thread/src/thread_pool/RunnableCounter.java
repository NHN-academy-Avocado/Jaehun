package thread_pool;

public class RunnableCounter implements Runnable {
    private Thread thread;
    private int count = 0;
    private int maxCount;
    private long interval = 1000;

    public RunnableCounter(ThreadGroup group, String name, int maxCount) {
        thread = new Thread(group, this, name);
        this.maxCount = maxCount;
    }

    public RunnableCounter(String name, int maxCount) {
        thread = new Thread(this, name);
        this.maxCount = maxCount;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (count < maxCount) {
                increment();
                System.out.println(thread.getName() + " : " + getCount());
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}