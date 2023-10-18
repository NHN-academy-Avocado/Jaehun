import javax.swing.JOptionPane;

public class Exercise12 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
        for (int i = 2; i <= n; i++) {
            if (Exercise11.prime(i)){
                System.out.println(i);
            }
        }
    }
}
