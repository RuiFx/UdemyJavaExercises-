import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many cases you want to calculate?");

        int n = sc.nextInt();

        System.out.println("Insert your cases:\n");

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double average = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("The average of %.1f, %.1f, %.1f is %.1f%n", a, b, c, average);
        }

        sc.close();
    }
}
