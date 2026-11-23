package org.example.level7_3;

public class AdjacentDuplicatesRemover {
    public int[] remove(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count = count + 1;
            }
        }

        int[] result = new int[count];
        result[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result[index] = arr[i];
                index = index + 1;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}
