package org.example.level9_3;

public class PairColumnsSplitter {

    /** Splits an array of pairs into two arrays: all first elements and all second elements. */
    public int[][] split(int[][] pairs) {
        int[] first = new int[pairs.length];
        int[] second = new int[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i].length != 2) {
                throw new IllegalArgumentException("Row " + i + " is not a pair");
            }
            first[i] = pairs[i][0];
            second[i] = pairs[i][1];
        }
        return new int[][]{first, second};
    }
}
