import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class S5_BOJ11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            list.add(i);
        }
        int index = 0;
        sb.append("<");
        while(!list.isEmpty()){
            index+=(k-1);
            while(index > (list.size()-1)) {
                index -= (list.size());
            }
            sb.append(list.get(index)+", ");
            list.remove(index);
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb.toString());
    }
}

