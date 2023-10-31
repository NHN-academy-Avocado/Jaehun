package runnable_interface_implement;

public class SelfRunnableCounter implements Runnable{
    private int count;
    private int maxCount;
    Thread thread;

    public SelfRunnableCounter(String name, int maxCount) {
        this.maxCount = maxCount;
        this.count=0;
        thread = new Thread(this, name);
    }
    public void start(){
        thread.start();
    }
    @Override
    public void run(){
        while(count < maxCount){
            try{
                count++;
                System.out.println(thread.getName() + " : " + count);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
