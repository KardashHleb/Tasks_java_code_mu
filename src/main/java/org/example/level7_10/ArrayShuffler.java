package org.example.level7_10;

import java.util.Random;

public class ArrayShuffler {
    public int[] shuffle(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        Random random = new Random();
        for (int i = result.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = result[i];
            result[i] = result[index];
            result[index] = temp;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }
}
