package ConditionalStructure;

import java.util.Scanner;

public class TernaryExpression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();
        double bill = 50.00;
        double extraMinutePrice = 2.00;

        bill = (minutes > 100) ? bill + (minutes - 100) * extraMinutePrice : bill;

        System.out.printf("Your bill is %.2f€%n", bill);

        sc.close();
    }
}
