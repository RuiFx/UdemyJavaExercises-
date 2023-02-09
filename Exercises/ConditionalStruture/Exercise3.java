import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.println("Insert two numbers");

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 != 0 && n2 != 0) {
            if (n2 % n1 == 0 || n1 % n2 == 0) {
                System.out.println(n1 + " and " + n2 + " are multiple!");
            } else {
                System.out.println(n1 + " and " + n2 + " are not multiple!");
            }
        } else {
            System.out.println("Zero is not multiple with any number!");
        }
    }
}
