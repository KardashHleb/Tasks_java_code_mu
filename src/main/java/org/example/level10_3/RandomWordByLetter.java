package org.example.level10_3;

import java.util.Random;

public class RandomWordByLetter {
    public String pick(String[] words, char letter) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (startsWith(words[i], letter)) {
                count = count + 1;
            }
        }
        if (count == 0) {
            System.out.println("");
            return "";
        }

        String[] matched = new String[count];
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (startsWith(words[i], letter)) {
                matched[index] = words[i];
                index = index + 1;
            }
        }

        String result = matched[new Random().nextInt(matched.length)];
        System.out.println(result);
        return result;
    }

    private boolean startsWith(String word, char letter) {
        if (word.length() == 0) {
            return false;
        }
        return Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(letter);
    }
}
