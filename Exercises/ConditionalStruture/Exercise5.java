import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        int code;
        int qty;
        String description;
        double price;
        double total;

        System.out.println("Insert the code of your product:");
        Scanner sc = new Scanner(System.in);

        code = sc.nextInt();
        sc.nextLine();
        System.out.println("Insert the quantity:");
        qty = sc.nextInt();

        if(code == 1){
            description = "Hot Dog";
            price = 4.00;
            total = price * qty;
            System.out.printf("Your %s costs %.2f\u20AC",description ,total);
        } else if (code == 2) {
            description = "X-Salade";
            price = 4.50;
            total = price * qty;
            System.out.printf("Your %s costs %.2f\u20AC",description ,total);
        } else if (code == 3) {
            description = "X-Bacon";
            price = 5.00;
            total = price * qty;
            System.out.printf("Your %s costs %.2f\u20AC",description ,total);
        } else if (code == 4){
            description = "Simple toast";
            price = 2.00;
            total = price * qty;
            System.out.printf("Your %s costs %.2f\u20AC",description ,total);
        } else if (code == 5) {
            description = "Soda";
            price = 1.50;
            total = price * qty;
            System.out.printf("Your %s costs %.2f\u20AC",description ,total);
        } else {
            System.out.println("Wrong Option!!");
        }

        sc.close();
    }
}
