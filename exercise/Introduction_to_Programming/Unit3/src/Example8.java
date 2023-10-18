import javax.swing.JOptionPane;

public class Example8 {         // Exercise 03.8
    public static void main(String[] args) {
        Book first =new TextBooksOfTheFreeUniversityOfBolzano(JOptionPane.showInputDialog("Insert a title"), JOptionPane.showInputDialog("Insert a author"), JOptionPane.showInputDialog("Insert a faculty"));
        System.out.println(first);
        Book second = new Book(JOptionPane.showInputDialog("Insert a title"), JOptionPane.showInputDialog("Insert a author"));
        Novel third = new Novel(second.getTitle(), second.getAuthors(), JOptionPane.showInputDialog("Insert a topic"));
        System.out.println(second);
        first.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Insert a price")));
        first.printBookPrice();
    }
}
