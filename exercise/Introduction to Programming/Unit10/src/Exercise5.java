import java.io.*;

public class Exercise5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int result = check(br, 0);
            System.out.println(result);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static int check(BufferedReader br, int count) throws IOException{
        String s  = br.readLine();
        if (s.isEmpty()) {
            return count;
        }else{
            if(s.equals("1")){
                count++;
            }
            return check(br,count);
        }
    }
}
