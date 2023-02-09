import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many divisions you want to do?");

        int n = sc.nextInt();

        System.out.println("Insert the numbers you want to divide:");

        for(int i = 0; i < n; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0 ){
                System.out.println("It's impossible to calculate");
            } else {
                double division = (double) a / b;
                System.out.printf("Result: %.1f", division);
            }
        }
       sc.close();
    }
}
