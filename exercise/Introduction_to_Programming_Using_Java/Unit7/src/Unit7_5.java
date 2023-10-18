import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit7_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] result = new double[100];
        int index = 0;
        double n = 1;
        System.out.println("Enter double positive num, you can enter 100 number");
        while (true) {
            n = Double.parseDouble(br.readLine());
            if (n == 0) {
                break;
            }
            result[index++] = n;
        }
        selectionSort(result, index);
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void selectionSort(double[] arr, int count) {
        for (int i = 0; i < count - 1; i++) {
            int index = i;
            for (int j = i + 1; j < count; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            double tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}
