/**
 * Created by Abraao Mota on 24/10/2016.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OneAwayTest {

    private static final OneAway oneAway = new OneAway();

    @Test
    public void paleAndPleAre1Away() {
        String s1 = "pale";
        String s2 = "ple";
        boolean expected = true;
        boolean actual = oneAway.check(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    public void palesAndPaleAre1Away() {
        String s1 = "pales";
        String s2 = "pale";
        boolean expected = true;
        boolean actual = oneAway.check(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    public void paleAndBaleAre1Away() {
        String s1 = "pale";
        String s2 = "bale";
        boolean expected = true;
        boolean actual = oneAway.check(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    public void palesAndBaleAreTooFarAway() {
        String s1 = "pales";
        String s2 = "bale";
        boolean expected = false;
        boolean actual = oneAway.check(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    public void paleAndBakeAreTooFarAway() {
        String s1 = "pale";
        String s2 = "bake";
        boolean expected = false;
        boolean actual = oneAway.check(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    public void palessoAndAlessoAre1Away() {
        String s1 = "palesso";
        String s2 = "alesso";
        boolean expected = true;
        boolean actual = oneAway.check(s1, s2);

        assertEquals(expected, actual);
    }

    @Test
    public void palessoAndAlessiAreTooFarAway() {
        String s1 = "palesso";
        String s2 = "alessi";
        boolean expected = false;
        boolean actual = oneAway.check(s1, s2);

        assertEquals(expected, actual);
    }
}
