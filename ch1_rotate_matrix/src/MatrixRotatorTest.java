/**
 * Created by Abraao Mota on 25/10/2016.
 */
import org.junit.Assert;
import org.junit.Test;

public class MatrixRotatorTest {

    private static final MatrixRotator matrixRotator = new MatrixRotator();

    @Test
    public void givenExampleTest() {


        /*
                Given Matrix:

                0   1   2   3
                4   5   6   7
                8   9   10  11
                12  13  14  15


                Expected Matrix (Rotated 90 deg to right):

                12  8   4  0
                13  9   5  1
                14  10  6  2
                15  11  7  3

         */

        int[][] matrix = new int[4][4];
        int counter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = counter;
                counter++;
            }
        }

        int[][] expected = {
            {12, 8,  4, 0},
            {13, 9,  5, 1},
            {14, 10, 6, 2},
            {15, 11, 7, 3}
        };

        int[][] actual = matrixRotator.rotate(matrix);

        Assert.assertArrayEquals(expected, actual);
    }
}