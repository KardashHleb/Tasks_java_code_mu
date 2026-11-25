package org.example.level8_1;

public class TripleBlocksArray {

    private static final int SIZE = 3;

    /** Returns a 3x3x3 array in which every innermost row is {1, 2, 3}. */
    public int[][][] make() {
        int[][][] result = new int[SIZE][SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                for (int k = 0; k < SIZE; k++) {
                    result[i][j][k] = k + 1;
                }
            }
        }
        return result;
    }
}
