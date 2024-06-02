package assignment3.problem1;

public class Exponential {
    /*
        x power n = x * (x power n-1);
     */

    public static void main(String[] args) {
        //create an instance of exponential
        Exponential e = new Exponential();

        double result = e.power(2,4);
        System.out.println("Result: " + result);
    }

    public static double power (double x, int n){
        //base case
        if (n == 0)  return 1;

        //recursive
        return x * power(x , n-1);
    }
}
