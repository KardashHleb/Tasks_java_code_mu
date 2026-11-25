package org.example.level2_1;

public class FirstCharsCollector {

    /** Returns the first character of every string in the array. */
    public char[] firstChars(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        char[] chars = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].isEmpty()) {
                throw new IllegalArgumentException("Element at index " + i + " is empty");
            }
            chars[i] = arr[i].charAt(0);
        }
        return chars;
    }
}
