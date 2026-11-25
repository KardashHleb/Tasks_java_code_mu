package org.example.level9_10;

import java.util.ArrayList;
import java.util.List;

public class MiddleBlankRemover {

    /** Removes empty lines between the first and the last non-empty line; leading and trailing empty lines are kept. */
    public String clean(String text) {
        String[] lines = text.split("\n", -1);
        int first = -1;
        int last = -1;
        for (int i = 0; i < lines.length; i++) {
            if (!lines[i].isEmpty()) {
                if (first < 0) {
                    first = i;
                }
                last = i;
            }
        }

        List<String> kept = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            boolean inside = i > first && i < last;
            if (!inside || !lines[i].isEmpty()) {
                kept.add(lines[i]);
            }
        }
        return String.join("\n", kept);
    }
}
