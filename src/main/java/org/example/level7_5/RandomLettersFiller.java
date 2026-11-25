package org.example.level7_5;

import java.util.Random;

public class RandomLettersFiller {

    private static final int SIZE = 10;

    /** Returns an array of 10 random lowercase Latin letters. */
    public char[] fill() {
        return fill(new Random());
    }

    /** Same as {@link #fill()} with a caller-supplied random generator. */
    public char[] fill(Random random) {
        char[] result = new char[SIZE];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) ('a' + random.nextInt(26));
        }
        return result;
    }
}
