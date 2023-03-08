import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> payerList = new ArrayList<>();

        System.out.print("Enter the number of Tax Payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.printf("\nTax Payer number %d info:%n", i);
            System.out.print("Individual or Company (i/c)? ");
            char taxPayerType = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            if (taxPayerType == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                payerList.add(new Individual(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                payerList.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        double totalTaxes = 0.00;
        System.out.println("\n### TAX PAID ###");
        for (TaxPayer taxPayer : payerList) {
            double tax = taxPayer.tax();
            System.out.println(taxPayer.taxReport());
            totalTaxes += tax;
        }

        System.out.printf("%nTotal Taxes: %.2f€", totalTaxes);
        sc.close();
    }
}