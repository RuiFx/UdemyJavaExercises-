package RepetitiveStructure;

import java.util.Scanner;

public class ForStructure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to sum?");

        int N = sc.nextInt();
        System.out.println("Insert the numbers to sum:\n");
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.printf("The total is %d%n", sum);
    }
}
