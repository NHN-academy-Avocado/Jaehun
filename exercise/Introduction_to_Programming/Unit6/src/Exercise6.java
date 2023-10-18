public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(decode("j}jwhnxj", 5));
    }
    public static String decode(String s, int d){
        String result = "";
        for(int i=0; i<s.length(); i++){
            result +=(char)(s.charAt(i) - d);
        }
        return result;
    }
}
