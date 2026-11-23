package org.example.level3_4;

public class TwoArraysMerger {
    public int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return result;
    }
}
