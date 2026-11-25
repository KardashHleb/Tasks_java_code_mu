package org.example.level7_5;

public class MinMaxRangeFiller {

    /** Returns all integers between the two bounds inclusive, in ascending order (bounds may come in any order). */
    public int[] fill(int first, int second) {
        int min = Math.min(first, second);
        int max = Math.max(first, second);
        int[] result = new int[max - min + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = min + i;
        }
        return result;
    }
}
