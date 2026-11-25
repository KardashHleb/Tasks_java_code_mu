package org.example.level10_10;

import java.util.Arrays;

public class MinMaxSwap {

    /** Returns a copy of the matrix in which the smallest and the largest element swapped places (first occurrences). */
    public int[][] swap(int[][] matrix) {
        int[][] result = Arrays.stream(matrix).map(int[]::clone).toArray(int[][]::new);
        int minRow = -1;
        int minColumn = -1;
        int maxRow = -1;
        int maxColumn = -1;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (minRow < 0 || result[i][j] < result[minRow][minColumn]) {
                    minRow = i;
                    minColumn = j;
                }
                if (maxRow < 0 || result[i][j] > result[maxRow][maxColumn]) {
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        if (minRow >= 0) {
            int temp = result[minRow][minColumn];
            result[minRow][minColumn] = result[maxRow][maxColumn];
            result[maxRow][maxColumn] = temp;
        }
        return result;
    }
}
