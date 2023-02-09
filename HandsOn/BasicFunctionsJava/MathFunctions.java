package BasicFunctionsJava;

import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the number to calculate it square root: ");

        double number = sc.nextDouble();
        double result = Math.sqrt(number);

        System.out.printf("The square root of %.2f is %.2f %n", number, result);
    }
}
