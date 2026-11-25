package org.example.level8_8;

import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.example.common.FileUtils;

public class UniqueWordsWriter {

    private static final Pattern WORD = Pattern.compile("[\\p{L}\\p{N}]+");
    private static final int WORDS_PER_LINE = 10;

    /** Writes the distinct words of the source file to the target file, ten per line, and returns the written text. */
    public String write(Path source, Path target) {
        String result = uniqueWords(FileUtils.readText(source));
        FileUtils.writeText(target, result);
        return result;
    }

    /**
     * Returns the distinct words of the text (case-sensitive) in order of first appearance, separated by
     * spaces, with a line break after every ten words.
     */
    public String uniqueWords(String text) {
        Set<String> unique = new LinkedHashSet<>();
        Matcher matcher = WORD.matcher(text);
        while (matcher.find()) {
            unique.add(matcher.group());
        }
        StringBuilder result = new StringBuilder();
        int inRow = 0;
        for (String word : unique) {
            if (inRow == WORDS_PER_LINE) {
                result.append('\n');
                inRow = 0;
            } else if (inRow > 0) {
                result.append(' ');
            }
            result.append(word);
            inRow++;
        }
        return result.toString();
    }
}
