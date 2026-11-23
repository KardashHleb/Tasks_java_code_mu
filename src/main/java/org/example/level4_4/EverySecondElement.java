package org.example.level4_4;

public class EverySecondElement {
    public int[] take(int[] arr) {
        int count = (arr.length + 1) / 2;
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i = i + 2) {
            result[index] = arr[i];
            System.out.println(result[index]);
            index = index + 1;
        }

        return result;
    }
}
