package org.example.level7_3;

public class MinMaxFinder {
    public int[] find(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int[] result = {max, min};
        System.out.println(result[0]);
        System.out.println(result[1]);
        return result;
    }
}
