package org.example.level4_8;

public class CharPairsMerger {

    /** Merges neighbouring characters into two-character strings, e.g. {'a', 'b', 'c', 'd'} gives {"ab", "cd"}. */
    public String[] merge(char[] arr) {
        if (arr.length % 2 != 0) {
            throw new IllegalArgumentException("Array length must be even, got " + arr.length);
        }
        String[] result = new String[arr.length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr, i * 2, 2);
        }
        return result;
    }
}
