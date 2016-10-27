/**
 * Created by Abraao Mota on 27/10/2016.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringRotatorTest {

    private static final StringRotator rotator = new StringRotator();

    @Test
    public void waterbottleTest1() {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean expected = true;
        boolean actual = rotator.checkForRotation(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    public void waterbottleTest2() {
        String s1 = "watwater";
        String s2 = "waterwat";
        boolean expected = true;
        boolean actual = rotator.checkForRotation(s1, s2);

        assertEquals(expected, actual);
    }

}
