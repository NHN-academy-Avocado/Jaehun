package thread_class_extension;

public class Counter {
    private String name;
    private int count;
    private int max;
    public Counter(String name, int max){
        this.name = name;
        count=0;
        this.max= max;
    }
    public void run(){
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
