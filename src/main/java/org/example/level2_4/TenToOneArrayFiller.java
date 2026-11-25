package org.example.level2_4;

public class TenToOneArrayFiller {

    /** Returns an array filled with the numbers from 10 down to 1. */
    public int[] fill() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
        }
        return arr;
    }
}
