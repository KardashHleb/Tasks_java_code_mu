package org.example.level7_7;

import java.util.Arrays;

public class FrequentDuplicatesRemover {

    private static final int MAX_OCCURRENCES = 3;

    /** Removes every value that occurs in the array more than three times; the order of the rest is kept. */
    public int[] remove(int[] values) {
        int[] result = new int[values.length];
        int size = 0;
        for (int value : values) {
            if (occurrences(values, value) <= MAX_OCCURRENCES) {
                result[size++] = value;
            }
        }
        return Arrays.copyOf(result, size);
    }

    private int occurrences(int[] values, int value) {
        int count = 0;
        for (int current : values) {
            if (current == value) {
                count++;
            }
        }
        return count;
    }
}
