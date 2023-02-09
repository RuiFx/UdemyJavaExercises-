
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

       double number;

        System.out.println("Chose your number!");
       Scanner sc = new Scanner(System.in);

       number = sc.nextInt();

       if (number < 0 || number > 100){
           System.out.println("Out of range");
       } else if (number <= 25) {
           System.out.println("You're in 0 to 25 range");
       } else if (number <= 50) {
           System.out.println("You're in 25 to 50 range");
       } else if (number <= 75){
           System.out.println("You're in 50 to 75 range");
       } else {
           System.out.println("You're in 75 to 100 range");
       }
       sc.close();
    }
}