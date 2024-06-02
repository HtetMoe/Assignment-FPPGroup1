package assignment3.problem5;

public class FindMax {
    public static void main(String[] args) {
        int [] a = {5, -3, 6, 1, 9, 4};
        int max = findMax(a);
        System.out.println(max);
    }
    public static int findMax(int[] a) {
        if (null == a || a.length < 1)
            throw new IllegalArgumentException("illegal array");
        return find(a, 0);
    }
    public static int find(int[] a, int index) {
        if (index == a.length - 1) {
            return a[index];
        }
        int res = find(a, index + 1);
        return (a[index] < res)? res : a[index];
    }
}
