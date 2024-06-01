package assignment4.problem1;

public class Clothing extends Product{
    private String brand;
    private double discountPercentage;

    public Clothing(String productName, double price, String brand, double discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1- this.discountPercentage/ 100); // discounted price
    }

    @Override
    public String toString() {
        return super.toString() + STR." Brand : \{this.brand}, discount % : \{this.discountPercentage}";
    }
}
