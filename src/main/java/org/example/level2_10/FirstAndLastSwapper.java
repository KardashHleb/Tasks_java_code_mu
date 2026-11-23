package org.example.level2_10;

public class FirstAndLastSwapper {
    public int[] swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }
}
