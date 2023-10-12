public class Unit3_7 {
    public static void main(String[] args) {
        findThree();
        same();
        check();
    }

    private static void findThree() {
        int[] arr =  new int[365];
        int count=0;
        while(true){
            int birthday = (int)(Math.random()*365);
            count++;
            if(arr[birthday] ==2){
                break;
            }
            arr[birthday]++;
        }
        System.out.println(count);
    }

    public static void same() {
        boolean[] date = new boolean[365];
        int count = 0;
        int result = 0;
        while (count < 365) {
            int birthday = (int) (Math.random() * 365);
            date[birthday] = true;
            count++;
        }
        for (int i = 0; i < 365; i++) {
            if (date[i]) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static void check() {
        boolean[] date = new boolean[365];
        int count = 0;
        int day = 0;

        while (day < 365) {
            int birthday = (int) (Math.random() * 365);
            count++;
            if (!date[birthday]) {
                date[birthday] = true;
                day++;
            }
        }
        System.out.println(count);
    }
}
