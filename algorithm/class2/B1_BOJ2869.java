import java.io.*;

public class B1_BOJ2869{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int v = Integer.parseInt(s[2]);
        int day = (v-b)/(a-b);
        if((v-b)%(a-b)!=0) day++;
        System.out.println(day);
    }

}