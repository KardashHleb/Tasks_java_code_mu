package org.example.level7_8;

import java.util.Random;

public class UniqueRandomFiller {
    public int[] fill(int count, int min, int max) {
        int span = max - min + 1;
        if (count > span) {
            count = span;
        }

        int[] result = new int[count];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            int value = random.nextInt(span) + min;
            boolean used = true;
            while (used) {
                used = false;
                value = random.nextInt(span) + min;
                for (int j = 0; j < i; j++) {
                    if (result[j] == value) {
                        used = true;
                    }
                }
            }
            result[i] = value;
            System.out.println(result[i]);
        }

        return result;
    }
}
