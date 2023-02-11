package NegativeNumbers;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will have your array?\nMaximum of 10 elements");

        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");

        for (int i = 0; i < numbers.length; i++) {
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