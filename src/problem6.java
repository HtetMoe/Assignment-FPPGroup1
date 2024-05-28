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
            else
                second = a[i];

        }
        if (second == min)
            return second;

        for(int i = 0; i < a.length; i++){
            if (a[i] != min && a[i] < second)
                second = a[i];
        }
        return second;
    }
}
