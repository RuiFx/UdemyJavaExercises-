import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Insert your number");

        number = sc.nextInt();

        if(number < 0){
            System.out.println("Number " + number + " is negative!");
        } else if (number > 0) {
            System.out.println("Number " + number + " is positive!");
        } else {
            System.out.println("You insert the zero!");
        }
        sc.close();
    }
}