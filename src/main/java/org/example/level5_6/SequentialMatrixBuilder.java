package org.example.level5_6;

public class SequentialMatrixBuilder {

    /** Builds a 3x3 array filled with the numbers 1 to 9 row by row. */
    public int[][] build() {
        int[][] matrix = new int[3][3];
        int value = 1;
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                row[j] = value++;
            }
        }
        return matrix;
    }
}
