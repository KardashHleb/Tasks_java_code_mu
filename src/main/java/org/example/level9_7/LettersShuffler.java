package org.example.level9_7;

import java.util.Random;

public class LettersShuffler {

    /** Shuffles the letters of a word with the Fisher-Yates algorithm. */
    public String shuffle(String word, Random random) {
        char[] letters = word.toCharArray();
        for (int i = letters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }
        return new String(letters);
    }
}
