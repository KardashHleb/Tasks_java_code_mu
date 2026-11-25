package org.example.level2_8;

public class StringsToCharArrayConverter {

    /** Returns all characters of all strings of the array, in order, as one char array. */
    public char[] toCharArray(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                throw new IllegalArgumentException("Element at index " + i + " is null");
            }
        }
        return String.join("", arr).toCharArray();
    }
}
