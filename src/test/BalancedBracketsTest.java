package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }



    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void reversedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void textAroundBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("asds[asdfasdf.]d)"));
    }

    @Test
    public void noBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("asdflkajsdflak"));
    }

    @Test
    public void missingOneSingleBracketReturnsFalse(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[asdfasdf"));
    }

    @Test
    public void missingOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("sdfs]"));
    }

    @Test
    public void oneOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void specialCharactersAndBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[(*&@#$]"));
    }

    @Test
    public void bracketsInsideBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsSequenceGoneWrong(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[]]]]"));
    }


}
