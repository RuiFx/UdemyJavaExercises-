package EvenNumbers;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        int evenNumbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements will have your array??");

        int n = sc.nextInt();
        int[] numbersList = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < numbersList.length; i++) {
            numbersList[i] = sc.nextInt();
        }

        System.out.print("Even numbers: ");

        evenNumbers = 0;
        for (int i = 0; i < numbersList.length; i++) {
            if (numbersList[i] % 2 == 0) {
                evenNumbers++;
                System.out.printf("%d ", numbersList[i]);
            }
        }

        System.out.printf("%nYou have %d even numbers", evenNumbers);

        sc.close();
    }
}
