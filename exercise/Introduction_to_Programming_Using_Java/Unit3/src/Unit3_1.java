public class Unit3_1 {
    public static void main(String[] args) {
        int count=0;
        int x;
        int y;
        while(true){
            x=(int)(Math.random()*6+1);
            y=(int)(Math.random()*6+1);
            if(x==1 && y==1){
                break;
            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
