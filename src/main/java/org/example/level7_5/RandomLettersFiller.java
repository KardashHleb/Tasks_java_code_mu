package org.example.level7_5;

import java.util.Random;

public class RandomLettersFiller {
    public char[] fill() {
        char[] result = new char[10];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = (char) ('a' + random.nextInt(26));
            System.out.println(result[i]);
        }

        return result;
    }
}
