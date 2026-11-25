package org.example.level5_5;

public class RepeatedRowsMatrix {

    /** Builds a 5x3 array where every row is 1, 2, 3. */
    public int[][] build() {
        int[][] matrix = new int[5][3];
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                row[j] = j + 1;
            }
        }
        return matrix;
    }
}
