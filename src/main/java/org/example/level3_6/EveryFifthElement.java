package org.example.level3_6;

public class EveryFifthElement {

    /** Returns every fifth element of the array: the elements at indexes 4, 9, 14 and so on. */
    public int[] take(int[] arr) {
        int[] result = new int[arr.length / 5];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i * 5 + 4];
        }
        return result;
    }
}
