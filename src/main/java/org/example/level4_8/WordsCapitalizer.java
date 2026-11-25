package org.example.level4_8;

public class WordsCapitalizer {

    /** Capitalizes the first letter of every word, keeping the original spacing. */
    public String capitalize(String str) {
        StringBuilder result = new StringBuilder(str.length());
        boolean newWord = true;
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current == ' ') {
                newWord = true;
                result.append(current);
            } else if (newWord) {
                result.append(Character.toUpperCase(current));
                newWord = false;
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }
}
