package Aplication;

import Entities.Products;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Products product = new Products();
        int quantity = 0;

        System.out.println("Register new product:");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.stock = sc.nextInt();

        product.menu();
        int option = sc.nextInt();
        boolean quit = false;
        do {
            switch (option) {
                case 1:
                    System.out.println(product.toString());
                    product.menu();
                    option = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Enter the quantity to add: ");
                    quantity = sc.nextInt();
                    product.addStock(quantity);
                    System.out.printf("Your stock is know: %d%n%n" +
                            "%s%n", product.stock, product.toString());
                    product.menu();
                    option = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Enter the quantity to remove: ");
                    quantity = sc.nextInt();
                    product.removeProducts(quantity);
                    System.out.printf("Your stock is know: %d%n%n" +
                            "%s%n", product.stock, product.toString());
                    product.menu();
                    option = sc.nextInt();
                    break;
                case 4:
                    System.out.printf("You have %.2f€ of stock value%n", product.totalValueInStock());
                    product.menu();
                    option = sc.nextInt();
                    break;
                case 5:
                    System.out.println("Quiting Product Manager");
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong option, try again;");
                    product.menu();
                    option = sc.nextInt();
                    break;
            }
        } while (!quit);

    }
}