package org.example.level7_3;

import java.util.Arrays;

public class AdjacentDuplicatesRemover {

    /** Collapses runs of equal neighbouring elements into a single element ({1, 1, 2, 1} -> {1, 2, 1}). */
    public int[] remove(int[] values) {
        int[] result = new int[values.length];
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == 0 || values[i] != values[i - 1]) {
                result[size++] = values[i];
            }
        }
        return Arrays.copyOf(result, size);
    }
}
