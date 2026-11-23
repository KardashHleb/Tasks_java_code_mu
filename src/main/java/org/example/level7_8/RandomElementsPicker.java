package org.example.level7_8;

import java.util.Random;

public class RandomElementsPicker {
    public int[] pick(int[] arr, int count) {
        int size = count;
        if (size > arr.length) {
            size = arr.length;
        }

        int[] pool = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pool[i] = arr[i];
        }

        Random random = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            int index = random.nextInt(pool.length - i);
            result[i] = pool[index];
            pool[index] = pool[pool.length - 1 - i];
            System.out.println(result[i]);
        }

        return result;
    }
}
