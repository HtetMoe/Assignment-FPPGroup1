public class Prog2 {
    public static void main(String[] args) {
        float x = 1.27f;
        float y = 3.881f;
        float z = 9.6F;

        float sum = x + y + z;
        int result1 = (int) sum;
        int result2 = Math.round(sum);

        System.out.println(STR."by casting the sum to type int : \{result1}");
        System.out.println(STR."by rounding the sum to the nearest integer : \{result2}");
    }
}
