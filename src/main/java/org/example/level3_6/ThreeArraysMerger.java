package org.example.level3_6;

public class ThreeArraysMerger {
    public int[] merge(int[] arr1, int[] arr2, int[] arr3) {
        int[] result = new int[arr1.length + arr2.length + arr3.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[index] = arr1[i];
            index = index + 1;
        }

        for (int i = 0; i < arr2.length; i++) {
            result[index] = arr2[i];
            index = index + 1;
        }

        for (int i = 0; i < arr3.length; i++) {
            result[index] = arr3[i];
            index = index + 1;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return result;
    }
}
