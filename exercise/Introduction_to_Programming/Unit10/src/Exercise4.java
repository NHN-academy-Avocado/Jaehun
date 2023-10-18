public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(gcd(10,5));
        System.out.println(isPrime(3,5));
        System.out.println(remainder(10,4));
    }
    public static int gcd(int x, int y){
        if(y==0){
            return x;
        }else{
            return gcd(y, x%y);
        }
    }
    public static boolean isPrime(int x, int y){
        if(x==1||y==1){
            return true;
        }else if(x==y){
            return false;
        }else if(x<y){
            return isPrime(x,y-x);
        }else {
            return isPrime(x-y,y);
        }
    }
    public static int remainder(int x, int y){
        if(x<0) {
            return remainder(x+y,y);
        }else if(x<y){
            return x;
        }else{
            return remainder(x-y,y);
        }
    }
}
