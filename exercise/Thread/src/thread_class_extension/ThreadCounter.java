package thread_class_extension;

public class ThreadCounter extends Thread {
    private int count;
    private int max;
    public ThreadCounter(String name, int max){
        setName(name);
        this.count=0;
        this.max = max;
    }
    @Override
    public void run(){
        while(count <max){
            try{
                count++;
                System.out.println(getName() + " : " + count);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        } // 각각의 instance가 실행 중일때, 디버거를 이용해 call stack을 비교해 보고 차이점을 이야기해 보자.
        // name이 없음
    }
}
