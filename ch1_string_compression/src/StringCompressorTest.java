/**
 * Created by Abraao Mota on 13/10/2016.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCompressorTest {

    private static final StringCompressor compressor = new StringCompressor();

    @Test
    public void testString1() {
        String string = "aaabbbbcccccaa";
        String expected = "a3b4c5a2";
        String actual = compressor.compress(string);

        assertEquals(actual, expected);
    }

    @Test
    public void returnsShorterString() {
        String string = "abcdef";
        String expected = "abcdef";
        String actual = compressor.compress(string);

        assertEquals(actual, expected);
    }

    @Test
    public void largerTestString() {
        String string = "abbcccddddeeeeeffffffggggggghhhhhhhhjjjjjjjjj";
        String expected = "a1b2c3d4e5f6g7h8j9";
        String actual = compressor.compress(string);

        assertEquals(actual, expected);
    }
}
