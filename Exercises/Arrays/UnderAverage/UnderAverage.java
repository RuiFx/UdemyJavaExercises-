package UnderAverage;

import java.util.Scanner;

public class UnderAverage {
    public static void main(String[] args) {

        double sum;
        double avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements will have your array??");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        System.out.println("Enter the " + n + " elements");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        System.out.print("The average of your " + n + " elements is ");

        sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        avg = sum / numbers.length;
        System.out.printf("%.3f%n", avg);

        System.out.println("\nElements under average:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg){
                System.out.printf("%.1f%n", numbers[i]);
            }
        }
        sc.close();
    }
}
