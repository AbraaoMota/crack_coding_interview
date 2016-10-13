/**
 * Created by Abraao Mota on 13/10/2016.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckPermutationTest {

    private static final CheckPermutation checker = new CheckPermutation();

    @Test
    public void smallStringPermutation() {
        String s1 = "abc";
        String s2 = "cba";
        boolean result = checker.isPermutation(s2, s1);
        assertEquals(true, result);
    }

    @Test
    public void noPermutation() {
        String s1 = "abcdefg";
        String s2 = "bloop";
        boolean result = checker.isPermutation(s2, s1);
        assertEquals(false, result);
    }

    @Test
    public void reverseAlphabet() {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "zyxwvutsrqponmlkjihgfedcba";
        boolean result = checker.isPermutation(s2, s1);
        assertEquals(true, result);
    }

    @Test
    public void emptyStrings() {
        String s1 = "";
        String s2 = "";
        boolean result = checker.isPermutation(s2, s1);
        assertEquals(true, result);
    }

    @Test
    public void notQuiteEqual() {
        String s1 = "aaaaa";
        String s2 = "aaaa";
        boolean result = checker.isPermutation(s2, s1);
        assertEquals(false, result);
    }
}