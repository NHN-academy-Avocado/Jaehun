import java.io.*;
public class Exercise8 {
    public static void main(String[] args) throws IOException{
        Apartment ap = new Apartment(10, "chosun");
        System.out.println(ap.getSize());
        System.out.println(ap.getAddress());
        System.out.println(ap.getNumbersOfPersons());
        ap.addPerson("shin");
        ap.addPerson("shina");
        ap.addPerson("shinb");
        ap.addPerson("shinc");
        ap.addPerson("shind");
        ap.addPerson("shine");
        ap.addPerson("shinf");
        ap.addPerson("shing");
        ap.addPerson("shinh");
        ap.addPerson("shini");
        ap.addPerson("shinj");
        System.out.println(ap.getPerson(0));
        System.out.println(ap.getPerson(20));
        ap.removePerson(0);
        System.out.println(ap.toString());


        ap.saveToFile("src/ex8");
        BufferedReader br = new BufferedReader(new FileReader("src/ex8"));
        ap.readFromFile(br);
    }
}
