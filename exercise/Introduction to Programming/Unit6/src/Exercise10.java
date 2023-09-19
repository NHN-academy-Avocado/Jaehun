import javax.swing.JOptionPane;

public class Exercise10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
        for(int i=1; i<=n; i++){
            System.out.println(Exercise3.factorial(i));
        }
    }
}
