import java.io.*;

public class Exercise7 {
    public static void main(String[] args)  throws IOException{
        System.out.println(fileExists("te.txt") + ", " + isInt("10") + ", " + isDouble("10"));
    }
    public static boolean fileExists(String filename) throws IOException {
        FileReader fr=null;
        try {
            fr = new FileReader(filename);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }finally {
            fr.close();
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
