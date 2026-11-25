package org.example.level9_8;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.example.common.FileUtils;

public class CharPercentFile {

    /** Writes into {@code target} the share of every character of {@code source} and returns the report. */
    public String write(Path source, Path target) {
        String result = report(FileUtils.readText(source));
        FileUtils.writeText(target, result);
        return result;
    }

    /** One line per distinct character in order of first appearance, e.g. "a 40.0%". */
    public String report(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char current : text.toCharArray()) {
            counts.merge(current, 1, Integer::sum);
        }
        List<String> lines = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            double percent = entry.getValue() * 100.0 / text.length();
            lines.add(String.format(Locale.ROOT, "%s %.1f%%", show(entry.getKey()), percent));
        }
        return String.join("\n", lines);
    }

    private static String show(char current) {
        return switch (current) {
            case ' ' -> "space";
            case '\n' -> "\\n";
            case '\t' -> "\\t";
            default -> String.valueOf(current);
        };
    }
}
