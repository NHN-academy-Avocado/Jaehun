import java.io.*;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(fileExists("te.txt") + ", " + isInt("10") + ", " + isDouble("10"));
    }
    public static boolean fileExists(String filename){
        try{
            FileReader fr = new FileReader(filename);
            return true;
        }catch (FileNotFoundException e){
            return false;
        }
    }
    public static boolean isInt(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public static boolean isDouble(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
