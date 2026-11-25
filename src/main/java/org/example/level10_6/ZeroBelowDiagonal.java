package org.example.level10_6;

import java.util.Arrays;

public class ZeroBelowDiagonal {

    /** Returns a copy of a square matrix with every element below the main diagonal set to zero. */
    public int[][] zero(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                throw new IllegalArgumentException("Matrix must be square");
            }
        }
        int[][] result = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < i; j++) {
                result[i][j] = 0;
            }
        }
        return result;
    }
}
