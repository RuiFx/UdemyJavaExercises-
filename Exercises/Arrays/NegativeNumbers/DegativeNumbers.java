package NegativeNumbers;

import java.util.Scanner;

public class DegativeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers to find the negatives\nMaximum of 10 numbers!\nNumber: ");

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the numbers:");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.printf("Your negatives numbers are: %d%n", numbers[i]);
            }
        }

        sc.close();
    }
}