package EvenAverage;

import java.util.Scanner;

public class EvenAverage {
    public static void main(String[] args) {

        int sum;
        double avg;
        int evenNumbers;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements will have your array?");

        int n = sc.nextInt();
        System.out.println("Enter the elements:");

        int[] numbersList = new int[n];

        for (int i = 0; i < numbersList.length; i++) {
            numbersList[i] = sc.nextInt();
        }

        sum = 0;
        evenNumbers = 0;
        for (int i = 0; i < numbersList.length; i++) {
            if (numbersList[i] % 2 == 0) {
                sum += numbersList[i];
                evenNumbers++;
            }
        }

        if (evenNumbers > 0) {
            avg = (double)sum / evenNumbers;
            System.out.printf("Average of even numbers: %.2f", avg);
        } else {
            System.out.println("No even numbers in this list.");
        }
        sc.close();
    }
}
