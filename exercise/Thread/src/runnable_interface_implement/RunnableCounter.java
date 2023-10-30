package runnable_interface_implement;

public class RunnableCounter implements Runnable{
    private String name;
    private int count;
    private int max;
    public RunnableCounter(String name, int max){
        this.name = name;
        this.count=0;
        this.max = max;
    }
    @Override
    public void run() {
        while(count <max){
            try{
                count++;
                System.out.println(name + " : " + count);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
