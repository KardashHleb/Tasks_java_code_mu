package org.example.level3_9;

public class ParallelArraysPrinter {
    public void printPairs(int[] arr1, int[] arr2) {
        int length = arr1.length;
        if (arr2.length < length) {
            length = arr2.length;
        }

        for (int i = 0; i < length; i++) {
            System.out.println(arr1[i] + "," + arr2[i]);
        }
    }
}
