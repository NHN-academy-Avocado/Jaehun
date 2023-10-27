import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S4_BOJ1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> pk1 = new HashMap<>();
        Map<Integer, String> pk2 = new HashMap<>();
        // HashMap 하나 선언후 keySet으로 탐색하면 시간초과
        StringBuilder sb = new StringBuilder();
//        String[] str = br.readLine().split(" ");
//        int n = Integer.parseInt(str[0]);
//        int m = Integer.parseInt(str[1]);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=1; i<=n; i++){
            String line = br.readLine();
            pk1.put(line, i);
            pk2.put(i, line);
        }
        while(m-- >0){
            String line = br.readLine();
            if(!Character.isDigit(line.charAt(0))){  //문자일 경우-숫자 출력
                int tmp = pk1.get(line);
                sb.append(tmp + "\n");

            }else {     //숫자인경우 - 문자 출력
                int tmp = Integer.parseInt(line);
                sb.append(pk2.get(tmp) + "\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
