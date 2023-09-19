import javax.swing.JOptionPane;

public class Exercise9 {
    public static void main(String[] args) {
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
        while (true) {
            if (height >= 1 && height <= 9) {
                pyramid(height);
                break;
            } else {
                System.out.println("Enter between 1 and 9");
                height = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
            }
        }
    }
    public static void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            int print = 0;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(++print);
            }
            for (int l = 0; l < i; l++) {
                System.out.print(--print);
            }
            System.out.println();
        }
    }
}
