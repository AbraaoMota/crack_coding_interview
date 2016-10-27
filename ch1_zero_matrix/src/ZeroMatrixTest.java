/**
 * Created by Abraao Mota on 27/10/2016.
 */
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZeroMatrixTest {
    private static final ZeroMatrix zeroMatrix = new ZeroMatrix();

    @Test
    public void testString1() {

        /*

            Given matrix:

            1  2   4  5
            3  4   1  0
            1  2   4  6
            9  12  1  2

            Expected matrix:

            1  2   4  0
            0  0   0  0
            1  2   4  0
            9  12  1  0

         */


        int[][] given = {
            {1, 2, 4, 5},
            {3, 4, 1, 0},
            {1, 2, 4, 6},
            {9, 12, 1, 2}
        };



        int[][] expected = {
                {1, 2, 4, 0},
                {0, 0, 0, 0},
                {1, 2, 4, 0},
                {9, 12, 1, 0}
        };

        int[][] actual = zeroMatrix.zeroOut(given);

        Assert.assertArrayEquals(expected, actual);
    }
}
