package org.example.level7_7;

import java.util.Arrays;

public class CommonElements {

    /** Returns the distinct values present in both arrays, in order of their first occurrence in {@code first}. */
    public int[] common(int[] first, int[] second) {
        int[] result = new int[first.length];
        int size = 0;
        for (int value : first) {
            if (contains(second, second.length, value) && !contains(result, size, value)) {
                result[size++] = value;
            }
        }
        return Arrays.copyOf(result, size);
    }

    private boolean contains(int[] values, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (values[i] == value) {
                return true;
            }
        }
        return false;
    }
}
