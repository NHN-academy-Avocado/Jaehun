public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(position("teete", 'e'));
        System.out.println(position("jaavaaa", 'a'));
        System.out.println(position("jaavaaa", 'c'));
    }
    public static int position(String s, char c) {
        int result = -1, count = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                if (count > max) {
                    max = count;
                    result = i-count+1;
                }
            } else {
                count = 0;
            }
        }
        return result;
    }
}

