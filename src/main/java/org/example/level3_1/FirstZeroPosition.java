package org.example.level3_1;

public class FirstZeroPosition {

    /** Returns the index of the first zero in the array, or -1 if there is no zero. */
    public int findFirstZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
