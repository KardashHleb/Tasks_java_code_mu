package org.example.level4_4;

public class EverySecondElement {

    /** Returns the elements at even indexes: the first, the third, the fifth and so on. */
    public int[] take(int[] arr) {
        int[] result = new int[(arr.length + 1) / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i * 2];
        }
        return result;
    }
}
