package org.example.level7_9;

public class RowMaximums {

    /** Returns the largest element of every row of a two-dimensional array. */
    public int[] maxima(int[][] rows) {
        int[] result = new int[rows.length];
        for (int i = 0; i < rows.length; i++) {
            if (rows[i].length == 0) {
                throw new IllegalArgumentException("Row " + i + " is empty");
            }
            int max = rows[i][0];
            for (int j = 1; j < rows[i].length; j++) {
                if (rows[i][j] > max) {
                    max = rows[i][j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}
