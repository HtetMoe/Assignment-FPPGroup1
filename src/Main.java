import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                System.out.printf("%-3s","*");
            }
            System.out.println();
        }
        String s = reverseString("hello");
        System.out.println(s);
        int sum = sum(5);
        System.out.println(sum);
    }

    public static String reverseString(String s){
        if (s.length() == 1)
            return s;
        String n = reverseString(s.substring(1));
        return n + s.charAt(0);
    }

    public static int sum(int n){
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);
    }

}