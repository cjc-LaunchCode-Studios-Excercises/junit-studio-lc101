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
    public void bracketWordBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void closeBracketWordOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test["));
    }

    @Test
    public void openOpenWordCloseCloseCloseReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[test]]]"));
    }

    @Test
    public void openOpenWordCloseReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[test]"));
    }

    @Test
    public void openOpenWordCloseCloseReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[test]]"));
    }




    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void noBracketsWithWordReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void oneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void oneCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void openCloseReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneBracketWithBracketThenWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[test"));
    }

    @Test
    public void closeBracketWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]test"));
    }

    @Test
    public void wordCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test]"));
    }

    @Test
    public void wordOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("test["));
    }


}
