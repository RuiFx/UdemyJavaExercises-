package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AverageHeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of heights that you want to calculate the average: ");
        int n = sc.nextInt();

        double[] heights = new double[n];

        System.out.printf("Enter the %d heights:%n",n);

        for (int i = 0; i < heights.length; i++){
            heights[i] = sc.nextDouble();
        }
        double sum = 0.0;

        for (int i =0; i < heights.length; i++){
            sum += heights[i];
        }
        double avg = sum/heights.length;

        System.out.printf("Your height average is %.2f", avg);

        sc.close();
    }
}
