import java.io.*;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        System.out.println(highAver());
        try{
            highAver();
        }catch(IllegalArgumentException e){

        }
    }
    public static String highAver() throws IOException{
        String result = "";
        try(BufferedReader br = new BufferedReader(new FileReader("src/ex5.txt"));) {
            if(br==null){
                throw new IllegalArgumentException("dddd");
            }
            String s;
            int max = -1;
            while ((s = br.readLine()) != null) {
                int count = 0, sum = 0;
                String[] str = s.split(" ");
                String name = str[0];
                for (int i = 1; i < str.length; i++) {
                    sum += Integer.parseInt(str[i]);
                    count++;
                }
                int ave = sum / count;
                if (ave > max) {
                    max = ave;
                    result = name;
                }
            }
        }
        return result;
    }

}
