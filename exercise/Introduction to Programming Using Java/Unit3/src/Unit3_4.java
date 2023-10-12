import java.util.Scanner;

public class Unit3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        boolean check= false;
        for(int i=0; i<line.length(); i++){
            if(Character.isLetter(line.charAt(i))){
                check = false;
                System.out.print(line.charAt(i));
            }else if(!check){
                System.out.println();
                check = true;
            }
        }
    }
}
