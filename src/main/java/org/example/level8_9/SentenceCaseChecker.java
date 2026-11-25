package org.example.level8_9;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class SentenceCaseChecker {

    /** Returns true if every sentence in the file starts with a capital letter. */
    public boolean allSentencesCapitalized(Path file) {
        return allSentencesCapitalized(FileUtils.readText(file));
    }

    /**
     * Returns true if the first letter of the text and the first letter after every '.', '!' or '?' is
     * upper case. Non-letters (spaces, quotes, digits) before that letter are skipped.
     */
    public boolean allSentencesCapitalized(String text) {
        boolean sentenceStart = true;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (sentenceStart && Character.isLetter(current)) {
                if (!Character.isUpperCase(current)) {
                    return false;
                }
                sentenceStart = false;
            } else if (current == '.' || current == '!' || current == '?') {
                sentenceStart = true;
            }
        }
        return true;
    }
}
