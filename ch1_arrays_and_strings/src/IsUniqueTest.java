/**
 * Created by Abraao Mota on 11/10/2016.
 */

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.Is;
import org.junit.Test;

public class IsUniqueTest {

    private static final IsUnique checker = new IsUnique();

    @Test
    public void evaluatesNonUniqueCorrectly() {
        String s = "abcdefgg";
        boolean result = checker.isUniqueCheck(s);
        assertEquals(false, result);
    }

    @Test
    public void evaluatesNonUniqueCorrectly2() {
        String s = "aabbccddeefgsfggg";
        boolean result = checker.isUniqueCheck(s);
        assertEquals(false, result);
    }
    @Test
    public void evaluatesUniqueCorrectly() {
        String s = "abcdefghij";
        boolean result = checker.isUniqueCheck(s);
        assertEquals(true, result);
    }

    @Test
    public void evaluatesEmptyStringToTrue() {
        String s = "";
        boolean result = checker.isUniqueCheck(s);
        assertEquals(true, result);
    }

    @Test
    public void worksOnLargerStrings() {
        String s = "abcdefghijklmnopqrstuvwxyz";
        boolean result = checker.isUniqueCheck(s);
        assertEquals(true, result);
    }
}
