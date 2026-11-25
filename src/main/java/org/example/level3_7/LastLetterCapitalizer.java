package org.example.level3_7;

public class LastLetterCapitalizer {

    /** Capitalizes the last letter of every word; words in the result are separated by single spaces. */
    public String capitalizeLastLetters(String str) {
        StringBuilder result = new StringBuilder();
        for (String word : str.trim().split(" +")) {
            if (word.isEmpty()) {
                continue;
            }
            if (!result.isEmpty()) {
                result.append(' ');
            }
            int last = word.length() - 1;
            result.append(word, 0, last).append(Character.toUpperCase(word.charAt(last)));
        }
        return result.toString();
    }
}
