package SequentialStructure;

import java.util.Scanner;

public class ScannerDouble {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Let's try with a double number ##");

        double scannerDouble;
        scannerDouble = sc.nextDouble();

        System.out.printf("You wrote %.2f%n", scannerDouble);

        sc.close();
    }
}
