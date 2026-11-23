package org.example.level6_3;

public class PairsSwapper {
    public int[] swap(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < result.length - 1; i = i + 2) {
            int temp = result[i];
            result[i] = result[i + 1];
            result[i + 1] = temp;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return result;
    }
}
