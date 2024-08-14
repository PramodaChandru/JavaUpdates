package java9.privateinterface;

public class BankTest {


    public static void main(String[] args) {
        Bank b = new SavingAccount(500);

        b.executeTransaction("DEPOSIT", 600);

        b.executeTransaction("WITHDRAW", 400);

        System.out.println(b.getBalance());
    }
}
