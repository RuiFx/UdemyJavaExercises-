import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        int product1, product2, qtd1, qtd2;
        double uniquePricePrdt1, uniquePricePrdt2, subTotal1, subTotal2, total;
        String eur = "\u20AC";

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the products code, quantity and unique Price");

        product1 = sc.nextInt();
        sc.nextLine();
        qtd1 = sc.nextInt();
        sc.nextLine();
        uniquePricePrdt1 = sc.nextDouble();
        sc.nextLine();
        subTotal1 = (double) qtd1 * uniquePricePrdt1;

        System.out.println("Insert the same information for the second product");

        product2 = sc.nextInt();
        sc.nextLine();
        qtd2 = sc.nextInt();
        sc.nextLine();
        uniquePricePrdt2 = sc.nextDouble();
        sc.nextLine();
        subTotal2 = (double) qtd2 * uniquePricePrdt2;

        total = subTotal1 + subTotal2;

        System.out.printf("You have to pay %.2f%s ", subTotal1, eur + " for product " + product1);
        System.out.printf("%nYou have to pay %.2f%s ", subTotal2, eur + " for product " + product2);
        System.out.printf("%nTOTAL OF PURCHASE: %.2f%s", total, eur);
    }
}
