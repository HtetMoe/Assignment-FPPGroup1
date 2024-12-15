package assignment3.problem4;

public class IsPalindrome {
    public static void main(String[] args) {
        int num = 13231;
        System.out.println("is palindrome " + isPalindrome(num));
    }

    //public utility method
    public static boolean isPalindrome(int n) {
        if (n < 0) return false; // if - num

        //num to string
        String s = String.valueOf(n);
        return checkIsPalindrome(s, 0, s.length() - 1);
    }

    //private recursive method
    private static boolean checkIsPalindrome(String s, int start, int end) {
        System.out.println("start: " + start + " end: " + end);

        //base case
        if (start >= end) return true; // check all indexes

        //check
        if (s.charAt(start) != s.charAt(end))
            return false;

        //recursive
        return checkIsPalindrome(s, start + 1, end - 1);
    }
}
