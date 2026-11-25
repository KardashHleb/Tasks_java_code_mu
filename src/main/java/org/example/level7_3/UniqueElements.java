package org.example.level7_3;

import java.util.Arrays;

public class UniqueElements {

    /** Returns the distinct elements of the array in order of their first occurrence. */
    public int[] unique(int[] values) {
        int[] result = new int[values.length];
        int size = 0;
        for (int value : values) {
            boolean seen = false;
            for (int j = 0; j < size && !seen; j++) {
                seen = result[j] == value;
            }
            if (!seen) {
                result[size++] = value;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
