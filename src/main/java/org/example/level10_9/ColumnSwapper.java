package org.example.level10_9;

import java.util.Arrays;

public class ColumnSwapper {

    /** Returns a copy of the matrix with two columns (0-based indexes) swapped. */
    public int[][] swap(int[][] matrix, int first, int second) {
        int[][] result = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        for (int[] row : result) {
            if (first < 0 || second < 0 || first >= row.length || second >= row.length) {
                throw new IllegalArgumentException("Column index out of range: " + first + ", " + second);
            }
            int temp = row[first];
            row[first] = row[second];
            row[second] = temp;
        }
        return result;
    }
}
