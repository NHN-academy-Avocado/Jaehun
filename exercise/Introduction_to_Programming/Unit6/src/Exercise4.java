import javax.swing.JOptionPane;

public class Exercise4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
        int positive =0, negative=0;
        for(int i=0; i<n; i++){
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
            if(n2 >0){
                positive +=n2;
            }else if(n2 <0){
                negative +=n2;
            }
        }
        System.out.println("positive : " + positive +", negative : " + negative);
    }
}
