package org.example.level9_4;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.example.common.FileUtils;

public class FrequentWord {

    /** Returns the most frequent word in a text file. */
    public String find(Path file) {
        return mostFrequent(FileUtils.readText(file));
    }

    /** Returns the most frequent word (case-insensitive, lowercased); on a tie the word that reached the top count first wins. */
    public String mostFrequent(String text) {
        Map<String, Integer> counts = new HashMap<>();
        String result = null;
        int best = 0;
        for (String word : text.toLowerCase(Locale.ROOT).split("[^\\p{L}\\p{N}]+")) {
            if (word.isEmpty()) {
                continue;
            }
            int count = counts.merge(word, 1, Integer::sum);
            if (count > best) {
                best = count;
                result = word;
            }
        }
        if (result == null) {
            throw new IllegalArgumentException("Text contains no words");
        }
        return result;
    }
}
