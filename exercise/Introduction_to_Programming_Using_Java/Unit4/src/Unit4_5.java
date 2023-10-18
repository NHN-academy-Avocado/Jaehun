public class Unit4_5 {
    public static void main(String[] args) {
        double[] arr = {11.2, 15.0, 44.4, 66.6};
        System.out.println(sum.apply(arr));
        System.out.println(avg.apply(arr));
        System.out.println(max.apply(arr));
        System.out.println(min.apply(arr));
        System.out.println(counter(15.0).apply(arr));
    }

    static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    count++;
                }
            }
            return count;
        };
    }
    public static final ArrayProcessor max = array -> {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    };
    public static final ArrayProcessor min = array -> {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    };
    public static final ArrayProcessor sum = array -> {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    };
    public static final ArrayProcessor avg = array -> sum.apply(array) / array.length;
}

