import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dollar value in euros: ");
        CurrencyConverter.dolar = sc.nextDouble();

        System.out.print("Enter the amount of dollars you bought: ");
        CurrencyConverter.value = sc.nextDouble();

        CurrencyConverter.currencyConverter();

        System.out.printf("You paid %.2f€ for $%.2f%n", CurrencyConverter.euro, CurrencyConverter.value);

    }
}