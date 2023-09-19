import javax.swing.JOptionPane;

public class Exercise1 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter integers"));
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
    }
}
