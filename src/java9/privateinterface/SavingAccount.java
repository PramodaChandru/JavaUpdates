package java9.privateinterface;

public class SavingAccount implements Bank{

    private double balance;

    public SavingAccount(double balance) {
        super();
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
    }



}
