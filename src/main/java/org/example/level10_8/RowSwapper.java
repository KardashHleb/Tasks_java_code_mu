package org.example.level10_8;

import java.util.Arrays;

public class RowSwapper {

    /** Returns a copy of the matrix with two rows (0-based indexes) swapped. */
    public int[][] swap(int[][] matrix, int first, int second) {
        if (first < 0 || second < 0 || first >= matrix.length || second >= matrix.length) {
            throw new IllegalArgumentException(
                    "Row index out of range: " + first + ", " + second + " for " + matrix.length + " rows");
        }
        int[][] result = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        int[] temp = result[first];
        result[first] = result[second];
        result[second] = temp;
        return result;
    }
}
