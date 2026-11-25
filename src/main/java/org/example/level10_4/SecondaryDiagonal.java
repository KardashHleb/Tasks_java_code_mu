package org.example.level10_4;

public class SecondaryDiagonal {

    /** Returns the elements of the secondary diagonal (top-right to bottom-left) of a square matrix. */
    public int[] take(int[][] matrix) {
        int size = matrix.length;
        for (int[] row : matrix) {
            if (row.length != size) {
                throw new IllegalArgumentException("Matrix must be square");
            }
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = matrix[i][size - 1 - i];
        }
        return result;
    }
}
