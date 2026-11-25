package org.example.level7_6;

import java.util.Random;

public class RandomLettersString {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";

    /** Returns a string of the given length made of random lowercase Latin letters. */
    public String make(int length) {
        return make(length, new Random());
    }

    /** Same as {@link #make(int)} with a caller-supplied random generator. */
    public String make(int length, Random random) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must not be negative: " + length);
        }
        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            result.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }
        return result.toString();
    }
}
