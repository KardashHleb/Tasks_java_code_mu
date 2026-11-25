package org.example.level4_5;

public class ElementsRepeater {

    /** Repeats every element twice in a row, e.g. {1, 2} gives {1, 1, 2, 2}. */
    public int[] repeatTwice(int[] arr) {
        int[] result = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            result[i * 2] = arr[i];
            result[i * 2 + 1] = arr[i];
        }
        return result;
    }
}
