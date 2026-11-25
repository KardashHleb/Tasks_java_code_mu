package org.example.level3_4;

public class NegativeCount {

    /** Counts the negative elements of the array. */
    public int countNegative(int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }
}
