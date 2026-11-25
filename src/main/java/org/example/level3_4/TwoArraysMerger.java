package org.example.level3_4;

public class TwoArraysMerger {

    /** Concatenates two arrays: elements of the first array followed by elements of the second. */
    public int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}
