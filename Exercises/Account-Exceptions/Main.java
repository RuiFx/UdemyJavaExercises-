import entities.Account;
import exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("## Create new account ##");
        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Holder: ");
        String holderAccount = sc.next();

        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account newAccount = new Account(accountNumber, holderAccount, balance, withdrawLimit);

        try{
            System.out.println("\n## Withdraw ##");
            System.out.print("Enter amount of withdraw: ");
            double withdrawAmount = sc.nextDouble();
            newAccount.withdraw(withdrawAmount);
        } catch (DomainException e){
            System.out.println("Can't withdraw: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error, try again later!");
        } 
        sc.close();
    }
}