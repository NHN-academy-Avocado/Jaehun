import javax.swing.JOptionPane;

public class Exercise13 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
        int i=2;
        while(n>0){
            if(Exercise11.prime(i)){
                System.out.println(i);
                n--;
            }
            i++;
        }
    }
}
