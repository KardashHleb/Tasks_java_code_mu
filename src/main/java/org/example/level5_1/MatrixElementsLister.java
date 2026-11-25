package org.example.level5_1;

import java.util.StringJoiner;

public class MatrixElementsLister {

    /** Returns all elements of a two-dimensional array row by row, one element per line. */
    public String toLines(int[][] matrix) {
        StringJoiner lines = new StringJoiner("\n");
        for (int[] row : matrix) {
            for (int element : row) {
                lines.add(String.valueOf(element));
            }
        }
        return lines.toString();
    }
}
