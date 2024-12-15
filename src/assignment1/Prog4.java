package assignment1;

import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        String[] input = new String[]{"horse", "dog", "cat", "horse", "dog" };
        String[] output = removeRepeat(input);
        System.out.println(Arrays.toString(output));
    }

    public static String[] removeRepeat(String[] input) {
        String[] tempArr = new String[input.length];
        int arrCnt = 0;

        for (String string : input) {
            boolean repeat = false;
            for (int j = 0; j < input.length; j++) {
                if (string.equals(tempArr[j])) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                tempArr[arrCnt++] = string;
            }
        }

        //remove null values
        String[] result = new String[arrCnt];
        System.arraycopy(tempArr, 0, result, 0, arrCnt);

        return result;
    }
}
