package org.example.level5_2;

public class MatrixElementsSum {

    /** Returns the sum of all elements of a two-dimensional array. */
    public long sum(int[][] matrix) {
        long result = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                result += element;
            }
        }
        return result;
    }
}
