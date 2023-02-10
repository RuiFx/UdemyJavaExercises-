import Enteties.BankActions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankActions actions;

        System.out.println("Enter the info of your client");
        System.out.print("Account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Account holder: ");
        String holderName = sc.next();

        System.out.print("Dou you'll make a initial deposit? (y/n): ");
        char option = sc.next().charAt(0);

        if (option == 'y'){
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            actions = new BankActions(accountNumber, holderName, initialDeposit);
        } else {
            actions = new BankActions(accountNumber, holderName);
        }

        System.out.println("Account data: " + actions);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();

        actions.deposit(deposit);
        System.out.println("Updated account data: " + actions);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();

        actions.withdraw(withdraw);
        System.out.println("Updated account data: " + actions);
    }
}