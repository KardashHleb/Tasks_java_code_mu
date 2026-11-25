package org.example.level2_7;

public class ArrayToStringMerger {

    /** Concatenates the array elements into one string without separators. */
    public String merge(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        StringBuilder result = new StringBuilder();
        for (int element : arr) {
            result.append(element);
        }
        return result.toString();
    }
}
