package org.example.level3_3;

public class FloatsToInts {

    /** Rounds every element of the array to the nearest integer. */
    public int[] roundToInts(float[] arr) {
        int[] rounded = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rounded[i] = Math.round(arr[i]);
        }
        return rounded;
    }
}
