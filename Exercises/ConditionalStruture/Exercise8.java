import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        double salary;
        double tax;
        double firstTier = 0.08;
        double secondTier = 0.18;
        double thirdTier = 0.28;
        String percentSymbol = "\u0025";

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, insert your salary:");

        salary = sc.nextDouble();

        if(salary <= 2000.00){
            System.out.println("You are free of taxes");
        } else if (salary <= 3000.00){
            tax = (salary - 2000.00) * firstTier;
            System.out.printf("You are on first tier of taxes that is 8%s, so you will pay R$ %.2f of taxes", percentSymbol, tax);
        } else if (salary <= 4500.00){
            tax = ((salary - 3000) * secondTier) + 1000 * firstTier;
            System.out.printf("You are on first tier of taxes that is 18%s, so you will pay R$ %.2f of taxes", percentSymbol, tax);
        } else {
            tax = ((salary - 4500) * thirdTier) + 1500 * secondTier + 1000 * firstTier;
            System.out.printf("You are on first tier of taxes that is 28%s, so you will pay R$ %.2f of taxes", percentSymbol, tax);
        }

        sc.close();
    }
}
