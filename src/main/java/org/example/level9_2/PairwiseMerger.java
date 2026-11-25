package org.example.level9_2;

public class PairwiseMerger {

    /** Merges two arrays of equal length into an array of pairs {first[i], second[i]}. */
    public int[][] merge(int[] first, int[] second) {
        if (first.length != second.length) {
            throw new IllegalArgumentException(
                    "Arrays must have the same length: " + first.length + " and " + second.length);
        }
        int[][] result = new int[first.length][];
        for (int i = 0; i < first.length; i++) {
            result[i] = new int[]{first[i], second[i]};
        }
        return result;
    }
}
