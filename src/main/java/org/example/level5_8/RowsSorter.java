package org.example.level5_8;

import java.util.Arrays;

public class RowsSorter {

    /** Returns a copy of the two-dimensional array with every row sorted in ascending order. */
    public int[][] sortRows(int[][] matrix) {
        int[][] result = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = matrix[i].clone();
            Arrays.sort(result[i]);
        }
        return result;
    }
}
