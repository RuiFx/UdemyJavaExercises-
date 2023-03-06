import entities.ImportedProduct;
import entities.Product;
import entities.RefurbishedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("How many products to register? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print("What type of product?" + "\n" +
                    "Common, refurbished or imported? (c/r/i)");
            char type = sc.next().charAt(0);
            System.out.print("Product name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'r'){
                System.out.print("Manufacture date (dd/mm/yyyy): ");
                Date manufactureDate = simpleDateFormat.parse(sc.next());
                productList.add(new RefurbishedProduct(name, price, manufactureDate));
            } else if (type == 'i'){
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customFee));
            } else {
                productList.add(new Product(name, price));
            }
        }

        System.out.println("\n### PRICE TAGS ###");

        for(Product tagPrice : productList){
            System.out.println(tagPrice.toString());
        }

        sc.close();
    }
}