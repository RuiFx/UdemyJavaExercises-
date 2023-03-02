package enteties;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
    private Date orderDate;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date orderDate, OrderStatus status, Client client) {
        this.orderDate = orderDate;
        this.status = status;
        this.client = client;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem newItem){
        items.add(newItem);
    }

    public void removeItem(OrderItem oldItem){
        items.remove(oldItem);
    }
    public double total(){
        double total = 0.00;
        for (OrderItem item : items){
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder resume = new StringBuilder();
        resume.append("Order date: ");
        resume.append(simpleDateFormat.format(orderDate) + "\n");
        resume.append("Status: ");
        resume.append(status + "\n");
        resume.append("## Client ##\n");
        resume.append(client);
        resume.append("## Order ##\n");
        for (OrderItem item : items){
            resume.append(item + "\n");
        }
        resume.append("## TOTAL ##\n");
        resume.append(String.format("%.2f€",total()));
        return resume.toString();
    }
}
