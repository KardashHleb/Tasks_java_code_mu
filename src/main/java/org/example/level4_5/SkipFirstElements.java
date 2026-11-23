package org.example.level4_5;

public class SkipFirstElements {
    public int[] skip(int[] arr, int count) {
        int length = arr.length - count;
        if (length < 0) {
            length = 0;
        }

        int[] result = new int[length];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i + count];
            System.out.println(result[i]);
        }

        return result;
    }
}
