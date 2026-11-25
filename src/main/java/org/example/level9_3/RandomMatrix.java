package org.example.level9_3;

import java.util.Random;

public class RandomMatrix {

    /** Creates a rows x columns matrix filled with random digits 0..9. */
    public int[][] make(int rows, int columns, Random random) {
        if (rows < 0 || columns < 0) {
            throw new IllegalArgumentException("Size must not be negative: " + rows + "x" + columns);
        }
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = random.nextInt(10);
            }
        }
        return result;
    }
}
