package daemon;

public class Worker extends RunnableCounter {
    RunnableCounter runnableCounter;

    public Worker(String name, int maxCount) {
        super(name, maxCount);
        this.runnableCounter = new RunnableCounter("internal worker", maxCount);
        this.runnableCounter.setDaemon(true);
    }

    public void run() {
        this.runnableCounter.start();
        super.run();
    }
}
