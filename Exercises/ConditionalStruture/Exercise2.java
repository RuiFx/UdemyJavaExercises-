import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Insert an integer number!");

        number = sc.nextInt();

        if (number % 2 == 0 && number != 0){
            System.out.println(number + " is even!");
        } else if(number % 2 != 0){
            System.out.println(number + " is odd!");
        } else {
            System.out.println("Zero is just zero!");
        }
    }
}
