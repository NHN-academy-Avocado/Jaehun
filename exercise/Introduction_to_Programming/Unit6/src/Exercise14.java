import javax.swing.JOptionPane;

public class Exercise14 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
        int i=2;
        while(n!=0){
            if(Exercise11.prime(i) && n%i==0){
                System.out.println(i);
                n/=i;
            }else{
                i++;
            }
        }
    }
}
