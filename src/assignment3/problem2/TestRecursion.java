package assignment3.problem2;

import assignment3.problem1.Recursion;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRecursion {
    @Test
    public void Test1(){
        double act = Recursion.Power(2,10);
        double exp =1024d;
        assertEquals(exp, act);
    }
    @Test
    public void Test2 (){
        char act = Recursion.MinChar("jkwlqau", 0);
        char exp = 'a';
        assertEquals(exp, act);
    }
}
