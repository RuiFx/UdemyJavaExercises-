package ArraySum;

import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements will have your arrays?");

        int n = sc.nextInt();

        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int[] arrayC = new int[n];

        System.out.println("Enter the elements for array A:");

        for (int i = 0; i < arrayA.length; i++){
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for array B:");

        for (int i = 0; i < arrayB.length; i++){
            arrayB[i] = sc.nextInt();
        }

        System.out.println("Your new array with the sum of each element position:");

        for (int i = 0; i < arrayC.length; i++){
            arrayC[i] = arrayA[i] + arrayB[i];
            System.out.printf("%d%n", arrayC[i]);
        }

        sc.close();
    }
}
