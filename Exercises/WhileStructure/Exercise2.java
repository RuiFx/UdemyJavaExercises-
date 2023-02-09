import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your coordinates:");

        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("You're in first quarter!");
            } else if (x < 0 && y > 0) {
                System.out.println("You're in second quarter!");
            } else if (x < 0 && y < 0) {
                System.out.println("You're in third quarter!");
            } else {
                System.out.println("You're in fourth quarter!");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
