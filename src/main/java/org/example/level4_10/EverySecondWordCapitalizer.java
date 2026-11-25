package org.example.level4_10;

public class EverySecondWordCapitalizer {

    /** Capitalizes the first letter of every second word (the 2nd, 4th, ...); words are separated by spaces. */
    public String capitalize(String str) {
        String trimmed = str.trim();
        if (trimmed.isEmpty()) {
            return "";
        }
        String[] words = trimmed.split(" +");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(' ');
            }
            String word = words[i];
            if (i % 2 == 1) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word, 1, word.length());
            } else {
                result.append(word);
            }
        }
        return result.toString();
    }
}
