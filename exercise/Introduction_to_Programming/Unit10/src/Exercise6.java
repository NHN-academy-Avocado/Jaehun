public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(longSeq("aaabaabbbb", 'b',0,0));
    }
    public static int longSeq(String s, char c, int count, int max){
        if(s.isEmpty()) {
            return max;
        }else if(s.charAt(0)==c){
            count++;
            if(count > max){
                max = count;
            }
            return longSeq(s.substring(1), c, count, max);
        }else{
            return longSeq(s.substring(1), c,0,max);
        }
    }
}
