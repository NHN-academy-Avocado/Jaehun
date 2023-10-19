import java.io.*;

public class B1_BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(bf.readLine());
            if(n==0) break;
            String s = Integer.toString(n);
            switch (s.length()){
                case 1:
                    System.out.println("yes");
                    break;
                case 2:
                    if(s.charAt(0) == s.charAt(1)) System.out.println("yes");
                    else System.out.println("no");
                    break;
                case 3:
                    if(s.charAt(0) == s.charAt(2)) System.out.println("yes");
                    else System.out.println("no");
                    break;
                case 4:
                    if((s.charAt(0) == s.charAt(3)) && (s.charAt(1) == s.charAt(2)) ) System.out.println("yes");
                    else System.out.println("no");
                    break;
                case 5:
                    if((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3)) ) System.out.println("yes");
                    else System.out.println("no");
                    break;
            }

        }
}
