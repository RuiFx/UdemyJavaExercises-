import Entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter the employee's name: ");
        employee.name = sc.nextLine();

        System.out.print("Enter the gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Enter the tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s%nSalary: %.2f%n", employee.name, employee.NetSalary());
        System.out.print("\nDo you want to change is gross salary?");

        String option = sc.next();

        if (option.equals("y")) {
            System.out.println("Enter the percentage to increase " + employee.name + "'s salary, please, ignore the percentage symbol(%)");
            employee.percentage = sc.nextDouble();
            employee.IncreaseSalary();
        } else {
            System.out.println("Quiting app...");
        }

        sc.close();
    }
}