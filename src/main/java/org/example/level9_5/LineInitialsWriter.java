package org.example.level9_5;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class LineInitialsWriter {

    /** Writes the first non-blank character of every line of {@code source} into {@code target} and returns it. */
    public String write(Path source, Path target) {
        String result = initials(FileUtils.readText(source));
        FileUtils.writeText(target, result);
        return result;
    }

    /** First non-blank character of every non-blank line, concatenated. */
    public String initials(String text) {
        StringBuilder result = new StringBuilder();
        for (String line : text.split("\n")) {
            String trimmed = line.strip();
            if (!trimmed.isEmpty()) {
                result.append(trimmed.charAt(0));
            }
        }
        return result.toString();
    }
}
