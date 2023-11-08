import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class S3_BOJ9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map;
        String[] s;
        while (testCase-- > 0) {
            map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            int result = 1;
            for (int i = 0; i < n; i++) {
                s = br.readLine().split(" ");
                String line = s[1];
                map.put(line, map.getOrDefault(line, 1) + 1);
            }
            Iterator<String> keys = map.keySet().iterator();
            while (keys.hasNext()) {
                String key = keys.next();
                result *= map.get(key);
            }
            sb.append(result - 1).append("\n");
        }
        System.out.println(sb);
    }
}
