/**
 * Created by Abraao Mota on 17/10/2016.
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromePermutatorTest{

    private static final PalindromePermutator permChecker = new PalindromePermutator();

    @Test
    public void givenExampleTest() {
        String s1 = "Tact Coa";
        boolean expected = true;
        boolean actual = permChecker.isPalindromePermutation(s1);

        assertEquals(actual, expected);
    }

    @Test
    public void palindrome2() {
        String s1 = "tactCza";
        boolean expected = true;
        boolean actual = permChecker.isPalindromePermutation(s1);

        assertEquals(actual, expected);
    }

    @Test
    public void civicShouldBeTrue() {
        String s1 = "civic";
        boolean expected = true;
        boolean actual = permChecker.isPalindromePermutation(s1);

        assertEquals(actual, expected);
    }

    @Test
    public void iviccShouldBeTrue() {
        String s1 = "ivicc";
        boolean expected = true;
        boolean actual = permChecker.isPalindromePermutation(s1);

        assertEquals(actual, expected);
    }

    @Test
    public void livciShouldBeFalse() {
        String s1 = "livci";
        boolean expected = false;
        boolean actual = permChecker.isPalindromePermutation(s1);

        assertEquals(actual, expected);
    }

    @Test
    public void racecarIsPalindrome() {
        String s1 = "racecar";
        boolean expected = true;
        boolean actual = permChecker.isPalindrome(s1);

        assertEquals(actual, expected);
    }

    @Test
    public void raceecarIsPalindrome() {
        String s1 = "raceecar";
        boolean expected = true;
        boolean actual = permChecker.isPalindrome(s1);

        assertEquals(actual, expected);
    }
}