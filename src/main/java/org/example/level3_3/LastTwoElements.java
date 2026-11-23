package org.example.level3_3;

public class LastTwoElements {
    public int[] takeLastTwo(int[] arr) {
        int[] slice = new int[2];
        slice[0] = arr[arr.length - 2];
        slice[1] = arr[arr.length - 1];

        System.out.println(slice[0]);
        System.out.println(slice[1]);
        return slice;
    }
}
