
import javax.swing.JOptionPane;

public class Client {           // Exercose 03.2
    public static void main(String[] args)  {
        input();
    }
    public static void input(){
        String title =  JOptionPane.showInputDialog("Insert a title");
        String author = JOptionPane.showInputDialog("Insert a author");
        Book book1 = new Book(title,author);

        title =  JOptionPane.showInputDialog("Insert a title");
        author = JOptionPane.showInputDialog("Insert a author");
        Book book2 = new Book(title,author);

        book1.printBook();
        book2.printBook();
        book1.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Insert a book1_price")));
        book1.printBookPrice();
//
        Book book3 = Book.keyboardInput();
        book3.setPrice(10000);
        book3.printBookPrice();
    }
}
