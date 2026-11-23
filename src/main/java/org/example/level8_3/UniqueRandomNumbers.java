package org.example.level8_3;

import java.util.Random;

public class UniqueRandomNumbers {
    public int[] fill(int count, int min, int max) {
        int span = max - min + 1;
        if (count > span) {
            count = span;
        }
        if (count < 0) {
            count = 0;
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
