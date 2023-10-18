import javax.swing.JOptionPane;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(prime(Integer.parseInt(JOptionPane.showInputDialog("Enter integer"))));
    }
    public static boolean prime(int n){
        for(int i=2; i*i<=n; i++){
            if((n%i)==0){
                return false;
            }
        }
        return true;
    }
}
