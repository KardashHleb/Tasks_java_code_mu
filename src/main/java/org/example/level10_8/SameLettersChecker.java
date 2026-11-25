package org.example.level10_8;

import java.util.HashMap;
import java.util.Map;

public class SameLettersChecker {

    /**
     * Checks whether two strings consist of the same letters (are anagrams, case-sensitive):
     * letters of the first string are counted up, letters of the second counted down,
     * and every count must end at zero.
     */
    public boolean haveSameLetters(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        Map<Character, Integer> counts = new HashMap<>();
        for (char current : first.toCharArray()) {
            counts.merge(current, 1, Integer::sum);
        }
        for (char current : second.toCharArray()) {
            int left = counts.getOrDefault(current, 0);
            if (left == 0) {
                return false;
            }
            counts.put(current, left - 1);
        }
        return true;
    }
}
