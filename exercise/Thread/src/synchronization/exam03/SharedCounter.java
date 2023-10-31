package synchronization.exam03;

public class SharedCounter extends Thread {
    private int count;
    private int maxCCount;

    public SharedCounter(String name, int maxCount) {
        setName(name);
        this.maxCCount = maxCount;
        this.count=0;
    }
    @Override
    public void run(){
        while (count < maxCCount) {
            count++;
            SharedCount.increment();
        }
    }
}