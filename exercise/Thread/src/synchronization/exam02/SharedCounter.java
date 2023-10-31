package synchronization.exam02;

public class SharedCounter extends Thread {
    private SharedCount sharedCount;
    private int count;
    private int maxCCount;

    public SharedCounter(String name, int maxCount, SharedCount sharedCount) {
        setName(name);
        this.sharedCount = sharedCount;
        this.maxCCount = maxCount;
        this.count=0;
    }
    @Override
    public void run(){
        while (count < maxCCount) {
            count++;
            sharedCount.increment();
        }
    }
}
