package org.example.level2_9;

public class FirstAndSecondSwapper {
    public int[] swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }
}
