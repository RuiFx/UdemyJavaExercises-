package VectorSum;

import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to enter?");

        int n = sc.nextInt();
        double[] numbers = new double[n];
        double sum, avg;

        System.out.println("Enter the numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        sum = 0.0;
        System.out.print("Numbers on your list: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.1f | ", numbers[i]);
            sum += numbers[i];
        }

        avg = sum / numbers.length;

        System.out.printf("The sum of all elements: %.1f%nThe average of elements: %.1f", sum, avg);
        sc.close();
    }
}
