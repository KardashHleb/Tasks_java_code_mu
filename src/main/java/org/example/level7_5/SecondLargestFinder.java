package org.example.level7_5;

public class SecondLargestFinder {

    /** Returns the second largest distinct value of the array in a single pass. */
    public int find(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int largest = values[0];
        int second = 0;
        boolean hasSecond = false;
        for (int i = 1; i < values.length; i++) {
            int value = values[i];
            if (value > largest) {
                second = largest;
                largest = value;
                hasSecond = true;
            } else if (value < largest && (!hasSecond || value > second)) {
                second = value;
                hasSecond = true;
            }
        }
        if (!hasSecond) {
            throw new IllegalArgumentException("Array must contain at least two distinct values");
        }
        return second;
    }
}
