package org.example.level9_7;

import java.util.Random;

public class LettersShuffler {
    public String shuffle(String word) {
        char[] letters = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }

        Random random = new Random();
        for (int i = letters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
        }

        String result = "";
        for (int i = 0; i < letters.length; i++) {
            result = result + letters[i];
        }
        System.out.println(result);
        return result;
    }
}
