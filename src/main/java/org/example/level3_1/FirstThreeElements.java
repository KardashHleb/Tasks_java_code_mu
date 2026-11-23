package org.example.level3_1;

public class FirstThreeElements {
    public int[] takeFirstThree(int[] arr) {
        int[] slice = new int[3];

        for (int i = 0; i < slice.length; i++) {
            slice[i] = arr[i];
            System.out.println(slice[i]);
        }

        return slice;
    }
}
