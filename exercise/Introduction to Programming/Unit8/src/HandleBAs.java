import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class BankAccount {


    private String name;
    private String surname;
    private double balance;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public BankAccount(String name, String surname,  double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }
}

public class HandleBAs {
    private String filename;
    private List<BankAccount> accounts;


    public HandleBAs(String filename) throws IOException {
        this.filename = filename;
        this.accounts = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String s;
        while ((s = br.readLine()) != null) {
            accounts.add(new BankAccount(s, br.readLine(), Double.parseDouble(br.readLine())));
        }
        br.close();
    }

    public void interests(double rate) {
        for (BankAccount account : accounts) {
            account.setBalance(account.getBalance() * (1 + rate));
        }
    }

    public void print() {
        for (BankAccount account : accounts) {
            System.out.println("Name : " + account.getName());
            System.out.println("Surname : " + account.getSurname());
            System.out.println("Balance : " + account.getBalance());
            System.out.println();
        }
    }

    public void printNegative() {
        for (BankAccount account : accounts) {
            if (account.getBalance() < 0) {
                System.out.println("Name : " + account.getName());
                System.out.println("Surname : " + account.getSurname());
                System.out.println("Balance : " + account.getBalance());
            }
            System.out.println();
        }
    }
}
