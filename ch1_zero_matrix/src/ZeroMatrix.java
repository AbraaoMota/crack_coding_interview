/**
 * Created by Abraao Mota on 27/10/2016.
 */
/*
 * Question 1.8 - Zero Matrix - Page 91 - Hints 17, 74, 102
 *
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0
 *
 */

/*
 * Intuition:
 * Keep an array for rows and columns that were seen and zeroed out to be slightly faster, also avoids setting more 0's
 * than have actually been seen.
 * Loop over each element, if 0, loop for row and column setting to 0.
 *
 */
public class ZeroMatrix {

    public int[][] zeroOut(int[][] given) {

        int[] zeroedRows = new int[given.length];
        int[] zeroedColumns = new int[given[0].length];

        for (int i = 0; i < given.length; i++) {
            if (zeroedRows[i] == 1) {
                continue;
            }
            for (int j = 0; j < given[0].length; j++) {
                if (zeroedRows[i] == 1) {
                    break;
                }
                if (zeroedColumns[j] == 1) {
                    continue;
                }
                if (given[i][j] == 0) {
                    for (int k = 0; k < given[0].length; k++) {
                        given[i][k] = 0;
                    }
                    zeroedRows[i] = 1;

                    for (int l = 0; l < given.length; l++) {
                        given[l][j] = 0;
                    }
                    zeroedColumns[j] = 1;
                }
            }
        }

        return given;
    }
}
