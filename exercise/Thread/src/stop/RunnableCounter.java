package stop;

public class RunnableCounter implements Runnable{
    private String name;
    private int count;
    private int max;
    private boolean running;

    public RunnableCounter(String name, int max){
        this.name = name;
        this.count=0;
        this.max = max;
        this.running= true;
    }
    @Override
    public void run() {
        while(count <max && running){
            try{
                count++;
                System.out.println(name + " : " + count);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
            // running이 false로 바뀌어도 sleep상태에서 깨어나기 전까지 중단 안됨
            // 즉시 중단하려면 interrupt를 호출해야한다
        }
    }
    public void stop(){
        running = false;
    }
    public boolean isRunning(){
        return running;
    }
}
