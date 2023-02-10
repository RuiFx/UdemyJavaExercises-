package Enteties;

public class BankActions {

    private int numberAccount;
    private String holderName;
    private double balance;
    private final static double withdrawTax = 5.00;

    public BankActions(int numberAccount, String holderName, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.holderName = holderName;
        deposit(initialDeposit);
    }

    public BankActions(int numberAccount, String holderName) {
        this.numberAccount = numberAccount;
        this.holderName = holderName;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawBalance) {
        balance -= withdrawBalance + withdrawTax;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public String toString() {
        return "\nAccount: " + numberAccount +
                "\nHolder: " + holderName +
                "\nBalance: " + balance + "€";
    }
}
