package org.example.level6_3;

public class RangeArrayFiller {

    /** Fills an array with all integers between the two numbers inclusive, in ascending order. */
    public int[] fill(int first, int second) {
        int min = Math.min(first, second);
        int max = Math.max(first, second);
        long length = (long) max - min + 1;
        if (length > Integer.MAX_VALUE - 8) {
            throw new IllegalArgumentException("The range is too large for an array: " + length);
        }
        int[] result = new int[(int) length];
        for (int i = 0; i < result.length; i++) {
            result[i] = min + i;
        }
        return result;
    }
}
