package assignment2.problem4;

public class Pizza {
    final private PizzaSize pizzaSize;
    final private PizzaType pizzaType;
    final private int quantity;
    public static final double TAX_RATES = 0.3;

    Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaType = pizzaType;
        this.pizzaSize = pizzaSize;
        this.quantity = quantity;
    }

    private double calculatePizzaSizePrice(PizzaSize pizzaSize) {
        return switch(pizzaSize){
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };
    }

    private double calculatePizzaTypePrice(PizzaType pizzaType) {
        return switch(pizzaType){
            case VEGGIE -> 1.0;
            case PEPPERONI -> 2.0;
            case CHEEZE -> 1.5;
            case BBQ_CHICKEN -> 2.0;
        };
    }

    public String printOrderSummary(){
        double price = (calculatePizzaSizePrice(pizzaSize) + calculatePizzaTypePrice(pizzaType)) * quantity;
        double tax = price * TAX_RATES;
        return String.format("""
                Pizza Order:
                Size: %s
                Type: %s
                Qty: %d
                Price: %.2f
                Tax: %.2f
                Total Price: %.2f
                """, pizzaSize, pizzaType, quantity, price, tax, price+tax);

    }



}
