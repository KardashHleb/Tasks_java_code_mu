package org.example.level10_1;

public class MainDiagonal {

    /** Returns the elements of the main diagonal (top-left to bottom-right) of a square matrix. */
    public int[] take(int[][] matrix) {
        requireSquare(matrix);
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i][i];
        }
        return result;
    }

    private static void requireSquare(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                throw new IllegalArgumentException("Matrix must be square");
            }
        }
    }
}
