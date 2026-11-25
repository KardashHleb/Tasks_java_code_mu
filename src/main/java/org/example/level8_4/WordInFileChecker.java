package org.example.level8_4;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class WordInFileChecker {

    /** Returns true if the file contains the word as a whole word (case-sensitive). */
    public boolean contains(Path file, String word) {
        return containsWord(FileUtils.readText(file), word);
    }

    /**
     * Returns true if the text contains the word as a whole word: an occurrence counts only when it is not
     * glued to a letter or digit on either side, so "cat" is not found in "concatenate".
     */
    public boolean containsWord(String text, String word) {
        if (word.isBlank()) {
            throw new IllegalArgumentException("Word must not be blank");
        }
        int from = 0;
        int index = text.indexOf(word, from);
        while (index >= 0) {
            int after = index + word.length();
            boolean leftFree = index == 0 || !Character.isLetterOrDigit(text.charAt(index - 1));
            boolean rightFree = after == text.length() || !Character.isLetterOrDigit(text.charAt(after));
            if (leftFree && rightFree) {
                return true;
            }
            from = index + 1;
            index = text.indexOf(word, from);
        }
        return false;
    }
}
