package org.example.level10_10;

public class MatrixTranspose {

    /** Returns the transposed matrix: rows become columns. */
    public int[][] transpose(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0][0];
        }
        int width = matrix[0].length;
        for (int[] row : matrix) {
            if (row.length != width) {
                throw new IllegalArgumentException("Matrix must be rectangular");
            }
        }
        int[][] result = new int[width][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < width; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
