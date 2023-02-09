import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {


        System.out.println("Insert worker number");

        int workerNumber;
        double hours, value, salary;
        String eur = "\u20AC";

        value = 25.45;
        Scanner sc = new Scanner(System.in);

        workerNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Welcome " + workerNumber + ", your value per hour is " + value + "€");

        System.out.println("Insert your worked hours");

        hours = sc.nextDouble();
        salary = value * hours;

        System.out.printf("Your salary is %.2f%s", salary, eur);

        sc.close();
    }
}
