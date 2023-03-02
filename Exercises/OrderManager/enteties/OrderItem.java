package enteties;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product item;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product item) {
        this.quantity = quantity;
        this.price = price;
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "\nItem: " + item.getName() +
                "\nQuantity: " + quantity +
                "\nUnit Price: " + String.format("%.2f€", price) +
                "\nSub-Total: " + String.format("%.2f€", subTotal());
    }
}
