import javax.swing.JOptionPane;
public class Book {             //Exercise 03.1,6
    private String title;
    private String authors;
    private int price;
    public Book(String title, String authors){
        this.title = title;
        this.authors = authors;
        this.price = 0;
    }
    public static Book keyboardInput(){

    }
    public void printBook(){
        System.out.println("Title : " + this.title + "\nAuthors : " + this.authors);
    }
    public void printBookPrice(){
        System.out.println("Title : " + this.title + ", Authors : " + this.authors + ", Price : " + this.price);
    }
    public void windowBOok(){
        JOptionPane.showMessageDialog(null, "Title : " + this.title + "\nAuthors : " + this.authors);
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthors(){
        return this.authors;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "title = " + title + " " + ", authors = " + authors;
    }
}
