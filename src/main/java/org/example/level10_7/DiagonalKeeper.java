package org.example.level10_7;

public class DiagonalKeeper {

    /** Returns a copy of a square matrix in which everything except both diagonals is set to zero. */
    public int[][] keep(int[][] matrix) {
        int size = matrix.length;
        for (int[] row : matrix) {
            if (row.length != size) {
                throw new IllegalArgumentException("Matrix must be square");
            }
        }
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = matrix[i][i];
            result[i][size - 1 - i] = matrix[i][size - 1 - i];
        }
        return result;
    }
}
