import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Unit7_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter ArrayList size >> ");
        int count = Integer.parseInt(br.readLine());
        System.out.print("Enter ArrayList max num >> ");
        int max = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = makeArr(count, max);
        for(int i:list){
            System.out.print(i + " ");
        }
    }
    public static ArrayList<Integer> makeArr(int count, int max){
        ArrayList<Integer> result = new ArrayList<>();
        while(result.size() < count){
            int tmp = (int)(Math.random()*max +1);
            if (result.indexOf(tmp) == -1) {
                result.add(tmp);
            }
        }
        return result;
    }
}
