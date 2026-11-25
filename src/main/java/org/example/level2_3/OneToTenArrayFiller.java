package org.example.level2_3;

public class OneToTenArrayFiller {

    /** Returns an array filled with the numbers from 1 to 10. */
    public int[] fill() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
