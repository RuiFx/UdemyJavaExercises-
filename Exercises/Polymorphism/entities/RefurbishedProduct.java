package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RefurbishedProduct extends Product{

    private Date manufactureDate;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public RefurbishedProduct() {
    }

    public RefurbishedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "## COMMON PRODUCT ##" + "\n" +
                "Product: " + super.getName() + '\n' +
                "Price: " + super.getPrice() + "€\n" +
                "Manufacture Date: " + simpleDateFormat.format(manufactureDate) + "\n";
    }
}
