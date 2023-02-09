import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("With this app you can know if the numbers are between 10 and 20\n" +
                "How many numbers you want to test?");

        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        System.out.println("\nYou can know insert your numbers");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 10 && num <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%nYou have %d in and %d out of range", in, out);
        sc.close();
    }
}
