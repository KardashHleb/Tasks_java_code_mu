package org.example.level1_9;

public class LastAndFirstLetterChecker {

    /** Checks whether the last letter of the first word equals the first letter of the second word. */
    public boolean lastMatchesFirst(String word1, String word2) {
        requireNotEmpty(word1);
        requireNotEmpty(word2);
        return word1.charAt(word1.length() - 1) == word2.charAt(0);
    }

    private static void requireNotEmpty(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word must not be empty");
        }
    }
}
