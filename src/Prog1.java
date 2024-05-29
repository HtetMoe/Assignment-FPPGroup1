import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int x = rand.nextInt(1, 9);
        int y = rand.nextInt(3, 14);

        double pi = Math.PI;
        double result1 = Math.pow(pi, x); // π power x
        double result2 = Math.pow(y, pi);// y power π

        //printout with string template
        System.out.printf("π power x = %.2f%n", result1);
        System.out.printf("y power π = %.2f%n", result2);
    }
}
