package org.example.level7_8;

import java.util.Random;

public class NoAdjacentRandomFiller {
    public int[] fill(int count, int min, int max) {
        int[] result = new int[count];
        Random random = new Random();
        int span = max - min + 1;

        for (int i = 0; i < result.length; i++) {
            int value = random.nextInt(span) + min;
            while (i > 0 && span > 1 && value == result[i - 1]) {
                value = random.nextInt(span) + min;
            }
            result[i] = value;
            System.out.println(result[i]);
        }

        return result;
    }
}
