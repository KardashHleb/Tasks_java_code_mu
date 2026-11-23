package org.example.level4_6;

public class ZerosFilter {
    public int[] removeZeros(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                System.out.println(result[index]);
                index = index + 1;
            }
        }

        return result;
    }
}
