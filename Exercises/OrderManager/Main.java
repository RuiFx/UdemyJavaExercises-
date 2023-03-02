import enteties.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("## Enter client info ##");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("e-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (dd/mm/yyyy): ");
        Date birthdate = simpleDateFormat.parse(sc.next());

        Client newClient = new Client(name, email, birthdate);

        System.out.println("## Enter order info ##");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order newOrder = new Order(new Date(), status, newClient);

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();



        for (int i =1; i <= items; i++){
            System.out.printf("Enter the %dº item: %n", i);
            System.out.print("Product: ");
            String productName = sc.next();
            System.out.print("Product Price: ");
            double productPrice = sc.nextDouble();

            Product newProduct = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQtd = sc.nextInt();

            OrderItem newItem = new OrderItem(productQtd, productPrice, newProduct);

            newOrder.addItem(newItem);
        }

        System.out.println("## Order resume ##");
        System.out.println(newOrder);
        sc.close();
    }
}