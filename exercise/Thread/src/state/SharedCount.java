package state;

public class SharedCount {
    private  int count;

    public  int getCount() {
        return count;
    }

    public  synchronized void increment() {
        count++;
    }
}