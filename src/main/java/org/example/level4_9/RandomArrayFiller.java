package org.example.level4_9;

import java.util.Random;

public class RandomArrayFiller {
    public int[] fill() {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.println(arr[i]);
        }

        return arr;
    }
}
