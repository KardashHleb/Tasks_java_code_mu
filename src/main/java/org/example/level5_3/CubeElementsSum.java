package org.example.level5_3;

public class CubeElementsSum {

    /** Returns the sum of all elements of a three-dimensional array. */
    public long sum(int[][][] cube) {
        long result = 0;
        for (int[][] layer : cube) {
            for (int[] row : layer) {
                for (int element : row) {
                    result += element;
                }
            }
        }
        return result;
    }
}
