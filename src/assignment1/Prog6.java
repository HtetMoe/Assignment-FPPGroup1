package assignment1;

public class Prog6 {
    public static void main(String[] args) {
        int[] input = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMin(input);
    }

    public static void secondMin(int[] a) {
        int min = a[0];
        int secondMin = min;

        for (int i = 1; i < a.length; i++) {
            if (a[i] <= min) {
                min = a[i];
            } else {
                if (secondMin == min)
                    secondMin = a[i];
                else
                    secondMin = (a[i] < secondMin) ? a[i] : secondMin;
            }
        }

        System.out.println(STR."min = \{min}");
        System.out.println(STR."second min = \{secondMin}");
    }
}
