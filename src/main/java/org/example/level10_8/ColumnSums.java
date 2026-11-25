package org.example.level10_8;

public class ColumnSums {

    /** Sum of every column; rows may have different lengths (missing cells count as zero). */
    public long[] sum(int[][] matrix) {
        int width = 0;
        for (int[] row : matrix) {
            width = Math.max(width, row.length);
        }
        long[] result = new long[width];
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                result[j] += row[j];
            }
        }
        return result;
    }
}
