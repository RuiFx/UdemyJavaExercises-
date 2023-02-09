package RepetitiveStructure;

import java.util.Scanner;

public class DoWhileStructure {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char option;

        do {
            System.out.print("Insert the temperature in Celsius: ");

            double cel = sc.nextDouble();
            double far = 9 * cel / 5 + 32;

            System.out.printf("%.1fºC is %.1fºF", cel, far);

            System.out.println("\nWant to try new temperature? (y/n)");
            option = sc.next().charAt(0);

        } while (option != 'n');

        sc.close();
    }
}
