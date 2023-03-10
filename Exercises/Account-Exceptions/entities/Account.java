package entities;

import exceptions.DomainException;

public class Account {

    private Integer accountNumber;
    private String holderName;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer accountNumber, String holderName, Double balance, Double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if (amount > balance){
            throw new DomainException("You don't have enough balance to Withdraw " + amount + "€");
        } else if (amount > withdrawLimit) {
            throw new DomainException("Amount its higher than your withdraw limit, you only can withdraw " + withdrawLimit + "€ maximum.");
        } else {
            double newBalance = balance - amount;
            System.out.printf("Updated balance: %.2f€", newBalance);
        }
    }
}
