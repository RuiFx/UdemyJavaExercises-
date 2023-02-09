package SequentialStructure;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Let's try with a int number:");

        int scannerInt;
        scannerInt = sc.nextInt();

        System.out.println("You wrote " + scannerInt);

        sc.close();
    }
}
