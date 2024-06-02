package assignment3.problem3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println("before reverse : " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("reversed array : " + Arrays.toString(arr));
    }

    //public utility method
    public static void reverse(int[] array) {
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        System.out.println("start : " + start + " end : " + end);

        //base case, check the index
        if (start >= end)
            return;

        //swap
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        //recursive
        reverse(array, start + 1, end - 1);
    }

}
