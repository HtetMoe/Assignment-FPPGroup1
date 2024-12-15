package assignment4.problem1;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return STR."Procuct : \{this.productName}, Price : \{this.price}, ";
    }

}
