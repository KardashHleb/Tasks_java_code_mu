package org.example.level10_9;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.example.common.FileUtils;

public class FrequentChar {

    /** Returns the most frequent non-whitespace character of a text file. */
    public char find(Path file) {
        return mostFrequent(FileUtils.readText(file));
    }

    /** Most frequent non-whitespace character; on a tie the character that reached the top count first wins. */
    public char mostFrequent(String text) {
        Map<Character, Integer> counts = new HashMap<>();
        char result = 0;
        int best = 0;
        for (char current : text.toCharArray()) {
            if (Character.isWhitespace(current)) {
                continue;
            }
            int count = counts.merge(current, 1, Integer::sum);
            if (count > best) {
                best = count;
                result = current;
            }
        }
        if (best == 0) {
            throw new IllegalArgumentException("Text contains no characters other than whitespace");
        }
        return result;
    }
}
