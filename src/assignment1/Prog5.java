package assignment1;

import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = new int[]{5, 6, -4, 3, 1};
        int[] b = new int[]{3, 8, 9, 11};

        int outputLen = a.length + b.length;
        int[] output = new int[outputLen];

        //copy array
        System.arraycopy(a, 0, output, 0, a.length); // (src= source array reference, srcPosition, desc, descPos, length)
        System.arraycopy(b, 0, output, a.length, b.length);

        System.out.println(STR."result : \{Arrays.toString(output)}");
    }
}
