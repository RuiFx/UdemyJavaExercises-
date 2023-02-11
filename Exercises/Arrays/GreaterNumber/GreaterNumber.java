package GreaterNumber;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        int position;
        double greatesNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to verify?");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < numbers.length;  i++){
            numbers[i] = sc.nextDouble();
        }

        greatesNumber = 0.0;
        position = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatesNumber){
                greatesNumber = numbers[i];
                position = i;
            }
        }
        System.out.printf("The greatest number is %.1f%n", greatesNumber);
        System.out.printf("The greatest number is at position %d ", position);

        sc.close();
    }
}
