package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }
    @Override
    public String toString() {
        return "## IMPORTED PRODUCT ##" + "\n" +
                "Product: " + super.getName() + "\n" +
                "Price: " + super.getPrice() + "€\n" +
                "Total Price: " + totalPrice() + "€\n" +
                "Customs fee: " + customsFee + "€" + "\n";
    }
}
