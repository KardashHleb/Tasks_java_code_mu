package org.example.level9_9;

import java.util.ArrayList;
import java.util.List;

public class TextWidthWrapper {

    /** Wraps the text into lines of at most 70 characters. */
    public String wrap(String text) {
        return wrap(text, 70);
    }

    /**
     * Wraps the text into lines of at most {@code width} characters, breaking only between words.
     * A word longer than the width gets a line of its own.
     */
    public String wrap(String text, int width) {
        if (width < 1) {
            throw new IllegalArgumentException("Width must be positive: " + width);
        }
        List<String> lines = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        for (String word : text.strip().split("\\s+")) {
            if (word.isEmpty()) {
                continue;
            }
            if (line.isEmpty()) {
                line.append(word);
            } else if (line.length() + 1 + word.length() <= width) {
                line.append(' ').append(word);
            } else {
                lines.add(line.toString());
                line.setLength(0);
                line.append(word);
            }
        }
        if (!line.isEmpty()) {
            lines.add(line.toString());
        }
        return String.join("\n", lines);
    }
}
