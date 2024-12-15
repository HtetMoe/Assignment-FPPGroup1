package assignment3.problem2;

public class MinimumCharacter {

    public static void main(String[] args) {
        String s = "htetb";
        System.out.println("Minimum char is : " + minChar(s, 0));
    }

    // Minimum character in a string
    public static char minChar(String str, int idx){
        Character s1 = str.charAt(idx);
        if (str.indexOf(str.charAt(idx)) == str.length() -1){
            return str.charAt(idx);
        }
        else if (s1.compareTo(str.charAt(idx + 1)) > 0){
            return minChar(str.substring(idx + 1), idx);
        }
        else if (s1.compareTo(str.charAt(idx +1 )) < 0){
            return minChar(str.substring(idx, idx +1) + str.substring(idx + 2, str.length()), idx);
        }
        return minChar(str, idx + 1);
    }

}
