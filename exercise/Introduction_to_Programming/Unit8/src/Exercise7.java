import java.io.*;
public class Exercise7 {
    public static void main(String[] args)throws IOException {
        HandleBAs handleBAs = new HandleBAs("src/ex7.txt");
        handleBAs.print();
        handleBAs.interests(0.1);
        handleBAs.print();
    }
}
