package org.example.level9_10;

import java.util.Arrays;

public class ArrayToRows {

    /** Splits an array into rows of the given length; the last row may be shorter. */
    public int[][] split(int[] values, int rowLength) {
        if (rowLength < 1) {
            throw new IllegalArgumentException("Row length must be positive: " + rowLength);
        }
        int rows = (values.length + rowLength - 1) / rowLength;
        int[][] result = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int from = i * rowLength;
            result[i] = Arrays.copyOfRange(values, from, Math.min(from + rowLength, values.length));
        }
        return result;
    }
}
