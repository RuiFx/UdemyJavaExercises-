package Arrays;

import Arrays.Enteties.Product;

import java.util.Scanner;

public class ProductList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many products you want to enter?");

        int n = sc.nextInt();
        Product[] list = new Product[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter the products name:");
            String name = sc.next();
            System.out.print("Enter the products price:");
            double price = sc.nextDouble();
            System.out.println("Next product...");
            list[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i].getPrice();
        }

        double avgPrice = sum / list.length;

        System.out.printf("The price average of your products is: %.2f€", avgPrice);

        sc.close();
    }
}
