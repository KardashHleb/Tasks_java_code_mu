package org.example.level4_5;

public class ElementsRepeater {
    public int[] repeatTwice(int[] arr) {
        int[] result = new int[arr.length * 2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            result[index] = arr[i];
            result[index + 1] = arr[i];
            index = index + 2;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

        return result;
    }
}
