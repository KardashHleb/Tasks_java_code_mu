package org.example.level10_10;

import java.util.Arrays;

public class ColumnZero {

    /** Returns a copy of the matrix with the given column (0-based) filled with zeros. */
    public int[][] zero(int[][] matrix, int column) {
        int[][] result = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        for (int[] row : result) {
            if (column < 0 || column >= row.length) {
                throw new IllegalArgumentException("Column index out of range: " + column);
            }
            row[column] = 0;
        }
        return result;
    }
}
