package assignment4.problem1;

public class Electronics extends Product{
    private int warrantyMonth;
    private double warrantyCost;

    public Electronics(String productName, double price, int warrantyMonth, double warrantyCost) {
        super(productName,price);
        this.warrantyMonth = warrantyMonth;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost; // updated price
    }

    @Override
    public String toString() {
        return super.toString() + STR."Warranty Month : \{warrantyMonth}, Warranty Cost : \{warrantyCost}";
    }
}
