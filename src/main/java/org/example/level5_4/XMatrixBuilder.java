package org.example.level5_4;

import java.util.Arrays;

public class XMatrixBuilder {

    /** Builds a 3x3 array of chars filled with 'x'. */
    public char[][] build() {
        char[][] matrix = new char[3][3];
        for (char[] row : matrix) {
            Arrays.fill(row, 'x');
        }
        return matrix;
    }
}
