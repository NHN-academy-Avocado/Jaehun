import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Boolean> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while (n-- > 0) {
            map.put(br.readLine(), false);
        }
        while (m-- > 0) {
            String line = br.readLine();
            if (map.containsKey(line)) {
                map.replace(line, true);
            }
        }
        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        int count = 0;
        for(String key : keyList){
            if(map.get(key)){
                count++;
                sb.append(key+"\n");
            }
        }
        System.out.println(count + "\n"+sb);
        br.close();
    }
}
