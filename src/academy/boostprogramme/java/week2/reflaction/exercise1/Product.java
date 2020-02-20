package academy.boostprogramme.java.week2.reflaction.exercise1;

public class Product {
    private String product;
    private double price;

    public Product(String product, double price){
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
