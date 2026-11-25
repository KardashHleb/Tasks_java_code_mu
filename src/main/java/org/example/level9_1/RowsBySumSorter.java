package org.example.level9_1;

import java.util.Arrays;
import java.util.Comparator;

public class RowsBySumSorter {

    /** Returns a copy of the rows sorted by the sum of their elements in ascending order. */
    public int[][] sort(int[][] rows) {
        int[][] result = Arrays.stream(rows).map(int[]::clone).toArray(int[][]::new);
        Arrays.sort(result, Comparator.comparingLong(RowsBySumSorter::sum));
        return result;
    }

    private static long sum(int[] row) {
        long result = 0;
        for (int value : row) {
            result += value;
        }
        return result;
    }
}
