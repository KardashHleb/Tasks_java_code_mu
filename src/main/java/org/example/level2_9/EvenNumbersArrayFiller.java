package org.example.level2_9;

public class EvenNumbersArrayFiller {

    /** Returns an array filled with the even numbers from 2 to 100. */
    public int[] fill() {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
        }
        return arr;
    }
}
