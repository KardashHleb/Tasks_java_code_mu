package org.example.level2_5;

public class StringArrayToIntConverter {

    /** Parses every string of the array as an integer. */
    public int[] toIntArray(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                numbers[i] = Integer.parseInt(arr[i].trim());
            } catch (NumberFormatException | NullPointerException e) {
                throw new IllegalArgumentException("Element at index " + i + " is not an integer: " + arr[i], e);
            }
        }
        return numbers;
    }
}
