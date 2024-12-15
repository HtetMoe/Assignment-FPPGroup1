package assignment3.problem6;

import assignment3.problem1.Exponential;
import assignment3.problem2.MinimumCharacter;
import assignment3.problem3.ReverseArray;
import assignment3.problem4.IsPalindrome;
import assignment3.problem5.FindMax;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRecursion {
    @Test
    public void Test1() {
        double act = Exponential.power(2, 3);
        double exp = 8;
        assertEquals(exp, act);
    }

    @Test
    public void Test2() {
        char act = MinimumCharacter.minChar("jkwlqau", 0);
        char exp = 'a';
        assertEquals(exp, act);
    }

    @Test
    void Test3() {
        int[] act = ReverseArray.reverse(new int[]{1, 3, 5, 7, 9});
        int[] exp = {9, 7, 5, 3, 1};
        assertArrayEquals(exp, act);
    }

    @Test
    void Test4() {
        boolean act = IsPalindrome.isPalindrome(12321);
        assertTrue(act);
    }

    @Test
    void Test5() {
        int[] a = {23, -9, 89, 1, 0, 33, 100, 56, -90};
        int act = FindMax.findMax(a);
        int exp = 100;
        assertEquals(exp, act);
    }
}
