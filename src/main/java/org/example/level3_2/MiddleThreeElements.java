package org.example.level3_2;

public class MiddleThreeElements {
    public int[] takeMiddleThree(int[] arr) {
        int[] slice = new int[3];

        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[i + 2];
            System.out.println(slice[i]);
        }

        return slice;
    }
}
