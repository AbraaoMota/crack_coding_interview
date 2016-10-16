/**
 * Created by Abraao Mota on 13/10/2016.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UrlifyTest {

    private static final Urlify urlifier = new Urlify();

    @Test
    public void smallString() {
        String johnSmith = "Mr John Smith";
        String expected = "Mr%20John%20Smith";
        String actual = urlifier.getLink(johnSmith);

        assertEquals(actual, expected);
    }

    @Test
    public void emptyString() {
        String input = "";
        String expected = "";
        String actual = urlifier.getLink(input);

        assertEquals(actual, expected);
    }

    @Test
    public void lotsOfWhitespace() {
        String input = "H E L L O T H E R E  BL O OP";
        String expected = "H%20E%20L%20L%20O%20T%20H%20E%20R%20E%20%20BL%20O%20OP";
        String actual = urlifier.getLink(input);

        assertEquals(actual, expected);
    }
}