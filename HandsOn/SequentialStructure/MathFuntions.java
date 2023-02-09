package SequentialStructure;

import java.util.Scanner;

public class MathFuntions {

    public static void main(String[] args) {

        System.out.println("Insert a positive number");
        Scanner sc = new Scanner(System.in);

        double sqrt, pow, abs;
        double x, xPower, y;
        x = sc.nextDouble();
        sc.nextLine();
        sqrt = Math.sqrt(x);

        System.out.println("Insert the power");

        xPower = sc.nextDouble();
        sc.nextLine();
        pow = Math.pow(x, xPower);

        System.out.println("Insert a negative number");

        y = sc.nextDouble();
        sc.nextLine();
        abs = Math.abs(y);

        System.out.println("The square root of " + x + " is " + sqrt
            + "\nThe power of " + x + " with " + xPower + " is " + pow
            + "\nThe absolute of " + y + " is " + abs);

        sc.close();
    }
}
