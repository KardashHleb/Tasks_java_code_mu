package org.example.level10_5;

import java.util.Arrays;

public class ZeroMainDiagonal {

    /** Returns a copy of a square matrix with zeros on the main diagonal. */
    public int[][] zero(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                throw new IllegalArgumentException("Matrix must be square");
            }
        }
        int[][] result = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < result.length; i++) {
            result[i][i] = 0;
        }
        return result;
    }
}
