import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Apartment {
    private int size;
    private String address;
    private String[] numbersOfPersons;

    public Apartment(int size, String address) {
        this.size = size;
        this.address = address;
        this.numbersOfPersons = new String[10];
    }

    public int getSize() {
        return this.size;
    }

    public String getAddress() {
        return this.address;
    }

    public int getNumbersOfPersons() {
        int n = 0;
        for (int i = 0; i < numbersOfPersons.length; i++) {
            if (numbersOfPersons[i] != null) {
                n++;
            }
        }
        return n;
    }

    public void addPerson(String name) {
        int now = getNumbersOfPersons();
        if (now != 10) {
            this.numbersOfPersons[now] = name;
        }
    }

    public String getPerson(int n) {
        if (n >= getNumbersOfPersons()) {
            return null;
        } else {
            return this.numbersOfPersons[n];
        }
    }

    public void removePerson(int n) {
        int now = getNumbersOfPersons();
        if (n < now) {
            for (int i = n; i < now - 1; i++) {
                numbersOfPersons[i] = numbersOfPersons[i + 1];
            }
            numbersOfPersons[now - 1] = "";

        }
    }
    public void saveToFile(String filename)throws IOException {
        try(PrintWriter out = new PrintWriter(new FileWriter(filename));) {
            out.print(this.size);
            out.print(this.address);
            for (int i = 0; i < getNumbersOfPersons(); i++) {
                out.print(numbersOfPersons[i] + " ");
            }
        }
    }
    public static void readFromFile(BufferedReader br)throws IOException{
        try(PrintWriter out = new PrintWriter(System.out);) {
            int n = 0;
            while ((n = Integer.parseInt(br.readLine())) != 0) {
                out.println(n);
                out.println(br.readLine());
                out.println(br.readLine());
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size : " + this.size + "\naddress : " + address + "\naddress : ");
        for (int i = 0; i < numbersOfPersons.length; i++) {
            sb.append(numbersOfPersons[i] + " ");
        }
        return sb.toString();
    }
}
