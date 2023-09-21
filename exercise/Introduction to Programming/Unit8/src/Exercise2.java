import java.io.*;
public class Exercise2 {
    public static void main(String[] args) throws IOException{
        System.out.println("평균은 "  + aver());
    }
    public static double aver() throws IOException{
        int count = 0;
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("정수를 입력하세요. 0이 입력되면 중단됩니다.\n" + (count+1) +" : ");
        int n;
        while((n = Integer.parseInt(br.readLine())) !=0){
            sum+=n;
            count++;
            System.out.print((count+1) + " : ");
        }
        br.close();
        return (double)sum/count;
    }
}
