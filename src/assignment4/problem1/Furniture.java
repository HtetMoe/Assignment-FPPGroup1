package assignment4.problem1;

public class Furniture extends Product{
    private String material;
    private double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost; //updated price
    }

    @Override
    public String toString() {
        return super.toString() + STR." material : \{this.material}, shipping cost : \{shippingCost}";
    }
}
