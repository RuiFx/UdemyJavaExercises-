import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose you favorite product!\n\n" +
                "1 - Alcohol\n" +
                "2 - Gasoline\n" +
                "3 - Diesel\n" +
                "4 - Close the inquire");

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        int close = 0;
        int option;
        String finalMessage = "";

        option = sc.nextInt();

        while (option != 4) {
            switch (option) {
                case 1:
                    alcohol += 1;
                    option = sc.nextInt();
                case 2:
                    gasoline += 1;
                    option = sc.nextInt();
                case 3:
                    diesel += 1;
                    option = sc.nextInt();
                case 4:
                    finalMessage = "Thank you very much!";
                    break;
                default:
                    System.out.println("Wrong option, choose between 1 and 4!");
                    option = sc.nextInt();
            }
        }

        System.out.printf("Ranking is%nAlcohol: %d%nGasoline: %d%nDiesel: %d%n %s", alcohol, gasoline, diesel, finalMessage);

        sc.close();
    }
}
