package org.example.level7_4;

import java.util.Random;

public class RandomRangeFiller {
    public int[] fill(int count, int min, int max) {
        int[] result = new int[count];
        Random random = new Random();
        int span = max - min + 1;

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(span) + min;
            System.out.println(result[i]);
        }

        return result;
    }
}
