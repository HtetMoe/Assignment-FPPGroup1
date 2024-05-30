public class problem6 {
    public static void main(String[] args) {
        int[] a = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        System.out.println(findSecondMin(a));
    }
    public static int findSecondMin(int[] a) {
        int min = a[0];
        int second = min;
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= min) {
                min = a[i];
            }
            else{
                if (second == min)
                    second = a[i];
                else
                    second = (a[i] < second) ? a[i] : second;
            }

        }
        return second;
    }
}
