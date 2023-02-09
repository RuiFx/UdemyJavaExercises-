package Entities;

public class Employee {

    public String name;
    public double grossSalary, tax, percentage;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary() {
        grossSalary += grossSalary * percentage / 100;
        System.out.printf("The new %s's salary is %.2f€", name, grossSalary - tax);
    }
}
