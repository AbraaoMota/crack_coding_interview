/**
 * Created by Abraao Mota on 25/10/2016.
 */
/*
 * Question 1.7 - Rotate Matrix - Page 91 - Hints: 51, 100
 *
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate
 * the image by 90 degrees. Can you do this in place?
 *
 */

/*
 * Intuition:
 * A multidimensional array of int's can represent this well - an int is a 4 byte value.
 * To do this rotation into a new array; the logic can be simply shown on a whiteboard;
 * assuming a right rotation we get:
 *  new[i][j] = old[j][rowLength - i]
 *
 * The in place constraint makes this significantly harder.
 *
 */
public class MatrixRotator {

    public int[][] rotate(int[][] matrix) {
        int givenMatrixRowLen = matrix.length;
        if (givenMatrixRowLen == 0) {
            return null;
        }

        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < givenMatrixRowLen; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix[i][j] = matrix[givenMatrixRowLen - 1 - j][i];
                System.out.println("Assigning " + matrix[givenMatrixRowLen - 1 - j][i] + " into ");
            }
        }
        return newMatrix;
    }
}
