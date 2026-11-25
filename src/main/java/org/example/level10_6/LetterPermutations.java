package org.example.level10_6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LetterPermutations {

    private static final int MAX_LENGTH = 8;

    /** All distinct permutations of the letters of a word, e.g. "aab" -> [aab, aba, baa]. */
    public List<String> make(String word) {
        if (word.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(
                    "Word is too long for permutations: " + word.length() + " > " + MAX_LENGTH);
        }
        Set<String> found = new LinkedHashSet<>();
        walk(word, new boolean[word.length()], new StringBuilder(), found);
        return new ArrayList<>(found);
    }

    /** Backtracking: appends every unused letter in turn, recurses, then takes it back. */
    private static void walk(String word, boolean[] used, StringBuilder current, Set<String> found) {
        if (current.length() == word.length()) {
            found.add(current.toString());
            return;
        }
        for (int i = 0; i < word.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                current.append(word.charAt(i));
                walk(word, used, current, found);
                current.deleteCharAt(current.length() - 1);
                used[i] = false;
            }
        }
    }
}
