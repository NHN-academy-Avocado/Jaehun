import java.io.*;
import javax.swing.JOptionPane;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        mul();
    }
    public static void mul() throws IOException{
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
        try(PrintWriter out = new PrintWriter(new FileWriter("src/ex4.txt"));) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    out.print(i * j + " ");
                }
                out.println();
            }
        }
    }
}
