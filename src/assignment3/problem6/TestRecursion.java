package assignment3.problem6;

import assignment3.problem1.Exponential;
import assignment3.problem2.MinimumCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRecursion {
    @Test
    public void Test1(){
        double act = Exponential.power(2,3);
        double exp = 8;
        assertEquals(exp, act);
    }
    @Test
    public void Test2 (){
        char act = MinimumCharacter.minChar("jkwlqau", 0);
        char exp = 'a';
        assertEquals(exp, act);
    }
}
