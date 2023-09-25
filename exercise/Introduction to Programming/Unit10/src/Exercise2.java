public class Exercise2 {
    private static int COUNT = 0;
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n){
        System.out.println("활성화 횟수 " +  ++COUNT);
        if(n==0||n==1){
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
