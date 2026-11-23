package org.example.level2_4;

public class TenToOneArrayFiller {
    public int[] fill() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 - i;
            System.out.println(arr[i]);
        }

        return arr;
    }
}
