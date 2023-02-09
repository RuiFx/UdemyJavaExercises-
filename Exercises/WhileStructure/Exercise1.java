import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your pin:");

        int pinCode;
        pinCode = sc.nextInt();

        while (pinCode != 2002) {
            System.out.println("Your pin isn't correct, try again!");
            pinCode = sc.nextInt();
        }

        System.out.printf("Access Permitted");

        sc.close();
    }
}