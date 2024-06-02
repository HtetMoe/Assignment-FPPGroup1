package assignment3.problem1;

public class Recursion {
    public static void main(String[] args) {
        double d = Power(2,10);
        System.out.println(d);

        char c = MinChar("flwnibq", 0);
        System.out.println(c);
    }

    //Power x,n
    public static double Power (double x, int n){
        if (n == 0)
        {
            return 1;
        }
        return x * Power(x , n-1);
    }

    // Minimum character in a string
    public static char MinChar(String str, int idx){
        Character s1 = str.charAt(idx);
        if (str.indexOf(str.charAt(idx)) == str.length() -1){
            return str.charAt(idx);
        }
        else if (s1.compareTo(str.charAt(idx + 1)) > 0){
            return MinChar(str.substring(idx + 1), idx);
        }
        else if (s1.compareTo(str.charAt(idx +1 )) < 0){
            return MinChar(str.substring(idx, idx +1) + str.substring(idx + 2, str.length()), idx);
        }
        return MinChar(str, idx + 1);
    }

}


