package org.example.level2_4;

public class ArrayElementsDoubler {
    public int[] doubleElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            System.out.println(arr[i]);
        }

        return arr;
    }
}
