package org.example.level2_3;

public class OneToTenArrayFiller {
    public int[] fill() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

        return arr;
    }
}
