import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
        Random rand =new Random();
        int x = rand.nextInt(1,9);
        int y = rand.nextInt(3,14);
        double r1 = Math.pow(Math.PI, x);
        double r2 = Math.pow(y, Math.PI);

        System.out.printf("πx = %.2f%n", r1 );
        System.out.printf("yπ = %.2f%n", r2);
    }
}
