package org.example.level10_7;

public class ColumnPicker {

    /** Returns the elements of the given column (0-based) of the matrix. */
    public int[] take(int[][] matrix, int column) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (column < 0 || column >= matrix[i].length) {
                throw new IllegalArgumentException("Column index out of range: " + column);
            }
            result[i] = matrix[i][column];
        }
        return result;
    }
}
