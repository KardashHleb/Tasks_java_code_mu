package org.example.level1_1;

public class FirstTwoLettersChecker {

    /** Checks whether two words start with the same two letters. */
    public boolean haveSameFirstTwoLetters(String word1, String word2) {
        requireAtLeastTwoChars(word1);
        requireAtLeastTwoChars(word2);
        return word1.substring(0, 2).equals(word2.substring(0, 2));
    }

    private static void requireAtLeastTwoChars(String word) {
        if (word == null || word.length() < 2) {
            throw new IllegalArgumentException("Word must contain at least two characters: " + word);
        }
    }
}
