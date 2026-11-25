package org.example.level8_1;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class WordsParentheses {

    /** Reads the source file, wraps every word in parentheses and writes the result to the target file. */
    public String wrap(Path source, Path target) {
        String result = wrap(FileUtils.readText(source));
        FileUtils.writeText(target, result);
        return result;
    }

    /** Wraps every whitespace-separated word in parentheses, keeping the whitespace: "a b" -> "(a) (b)". */
    public String wrap(String text) {
        StringBuilder result = new StringBuilder();
        int wordStart = -1;
        for (int i = 0; i <= text.length(); i++) {
            boolean separator = i == text.length() || Character.isWhitespace(text.charAt(i));
            if (separator) {
                if (wordStart >= 0) {
                    result.append('(').append(text, wordStart, i).append(')');
                    wordStart = -1;
                }
                if (i < text.length()) {
                    result.append(text.charAt(i));
                }
            } else if (wordStart < 0) {
                wordStart = i;
            }
        }
        return result.toString();
    }
}
