package org.example.level5_7;

public class MatrixFlattener {

    /** Flattens a two-dimensional array into a one-dimensional one, row by row. */
    public int[] flatten(int[][] matrix) {
        int length = 0;
        for (int[] row : matrix) {
            length += row.length;
        }
        int[] result = new int[length];
        int index = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                result[index++] = element;
            }
        }
        return result;
    }
}
