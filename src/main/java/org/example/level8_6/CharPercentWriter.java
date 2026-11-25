package org.example.level8_6;

import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import org.example.common.FileUtils;

public class CharPercentWriter {

    /** Writes the share of every character of the source file to the target file and returns the written text. */
    public String write(Path source, Path target) {
        String result = percentages(FileUtils.readText(source));
        FileUtils.writeText(target, result);
        return result;
    }

    /**
     * Returns one line per distinct character, in order of first appearance, with its share of the text
     * truncated to one decimal place, for example "a 33.3%". Whitespace is shown as "space", "\n" or "\t".
     */
    public String percentages(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            counts.merge(text.charAt(i), 1, Integer::sum);
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (!result.isEmpty()) {
                result.append('\n');
            }
            // per mille, so integer arithmetic gives exactly one decimal digit
            int perMille = (int) ((long) entry.getValue() * 1000 / text.length());
            result.append(show(entry.getKey()))
                    .append(' ')
                    .append(perMille / 10)
                    .append('.')
                    .append(perMille % 10)
                    .append('%');
        }
        return result.toString();
    }

    private String show(char current) {
        return switch (current) {
            case ' ' -> "space";
            case '\n' -> "\\n";
            case '\t' -> "\\t";
            default -> String.valueOf(current);
        };
    }
}
