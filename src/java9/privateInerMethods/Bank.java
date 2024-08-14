package java9.privateInerMethods;

public interface Bank {
    double getBalance();

    void deposit(double amount);

    void withdraw(double amount);

    default void executeTransaction(String type, double amount) {
        if(type.equals("DEPOSIT")) {
            deposit(amount);
            logTransaction(type, amount);
        } else if(type.equals("WITHDRAW")){
            withdraw(amount);
            logTransaction(type, amount);
        }
    }

    private void logTransaction(String type, double amount) {
        System.out.println("Transaction = " + type);
        System.out.println("Amount = " + amount);
        System.out.println("Current Balance = " + getBalance());
    }

}
