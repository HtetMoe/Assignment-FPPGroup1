public class problem2 {
    public static void main(String[] args) {
        float x = 1.27f;
        var y = 3.881f;
        float z = 9.6F;

        int sum1 = (int)(x + y + z);
        int sum2 = Math.round(x+y+z);
        System.out.println("the sum of floats as int " + sum1);
        System.out.println("the sum of floats as int by rounding: " + sum2);
    }
}
