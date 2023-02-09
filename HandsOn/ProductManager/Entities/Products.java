package Entities;

public class Products {

    public String name;
    public double price;
    public int stock;

    public double totalValueInStock() {
        return (double) price * stock;
    }

    public void addStock(int quantityToAdd) {
        stock += quantityToAdd;
    }

    public void removeProducts(int quantityToRemove) {
        stock -= quantityToRemove;
    }

    public String toString() {
        return "Updated product list:\n" +
                "\nProduct: " + name +
                "\nPrice: " + String.format("%.2f", price) + "€" +
                "\nStock: " + stock + " units" +
                "\nTotal value: " + String.format("%.2f", totalValueInStock()) + "€\n";
    }

    public void menu(){
        System.out.println("What you want to do?\n" +
                "1 - Consult list of products\n" +
                "2 - Add stock\n" +
                "3 - Remove stock\n" +
                "4 - View stock value\n" +
                "5 - Quit Product Manager");
    }
}