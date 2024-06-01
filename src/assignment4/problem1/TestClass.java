package assignment4.problem1;

public class TestClass {
    public static void main(String[] args) {
        //a. create an array of 5 different object
        Product[] products = new Product[5];
        products[0] = new Clothing("T-shirt", 100,"H&M",10);
        products[1] = new Furniture("Sofa", 500.00, "Leather", 50.00);
        products[2] = new Clothing("White dress", 500, "YSL", 10);
        products[3] = new Electronics("Smartphone", 800.00, 12, 50.00);
        products[4] = new Furniture("Table", 150.00, "Wood", 30.00);

        //b. loop and print the status of obj
        for (Product product : products) {
            System.out.println(product.toString());
            System.out.println(STR."Price : \{product.getPrice()} \n");
        }

        //c. create a static method, return sum of all products
        double totalPrice = sumProducts(products);

        //d. print sum console
        System.out.println(STR."Total price of all product : \{totalPrice}");
    }

    public static double sumProducts(Product[] products) {
        double sum = 0;
        for (Product product : products) {
           sum += product.getPrice();
        }
        return sum;
    }
}
