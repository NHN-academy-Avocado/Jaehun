import java.util.ArrayList;
import java.util.Arrays;

public class Unit7_3 {

    public static String makeString(){
        StringBuilder sb = new StringBuilder();
        int length = 5+(int)(Math.random()*21);
        for(int i=0; i<length; i++){
            sb.append((char) (97 + (int) Math.random()));
        }
        return sb.toString();
    }
    public static String[] randomString(int size){
        String[] result = new String[size];
        for(int i=0; i<size; i++){
            result[i]= makeString();
        }
        return result;
    }
    public static double[] makeArr(int size){
        double[] result = new double[size];
        for(int i=0; i<size; i++){
            result[i]= (int)(Math.random()*10000);
        }
        return result;
    }
    public static void selectionSort(double[] arr){
        for(int i=0; i<arr.length-1; i++){
            int index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            double tmp = arr[i];
            arr[i] = arr[index];
            arr[index]= tmp;
        }
    }
    public static void selectionSort(String[] arr){
        for(int i=0; i<arr.length-1; i++){
            int index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j].compareTo(arr[index]) < 0){
                    index = j;
                }
            }
            String tmp = arr[i];
            arr[i] = arr[index];
            arr[index]= tmp;
        }
    }
    public static void main(String[] args) {
        long startTime;
        long endTime;
        double[] arrD = makeArr(10);
        String[] arrS = randomString(10);
        double[] arrD2 = Arrays.copyOf(arrD, arrD.length);
        String[] arrS2 = Arrays.copyOf(arrS, arrS.length);

        startTime= System.nanoTime();
        selectionSort(arrD);
        endTime = System.nanoTime();
        System.out.println("double selectionSort Runtime is " + (endTime-startTime)/1000000000.0 +"(s)");

        startTime= System.nanoTime();
        selectionSort(arrS);
        endTime = System.nanoTime();
        System.out.println("string selectionSort Runtime is " + (endTime-startTime)/1000000000.0 +"(s)");

        startTime= System.nanoTime();
        Arrays.sort(arrD2);
        endTime = System.nanoTime();
        System.out.println("double Arrays.sort Runtime is " + (endTime-startTime)/1000000000.0 +"(s)");

        startTime= System.nanoTime();
        selectionSort(arrS2);
        endTime = System.nanoTime();
        System.out.println("string Arrays.sort Runtime is " + (endTime-startTime)/1000000000.0 +"(s)");



    }
}
