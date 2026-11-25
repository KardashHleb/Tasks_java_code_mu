package org.example.level8_2;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class CommaMaxNumber {

    /** Returns the largest integer in a file of comma-separated numbers. */
    public int max(Path file) {
        return max(FileUtils.readText(file));
    }

    /** Returns the largest integer found in the text, parsing digits (with an optional minus) by hand. */
    public int max(String text) {
        boolean found = false;
        int max = 0;
        int i = 0;
        while (i < text.length()) {
            int sign = 1;
            if (text.charAt(i) == '-' && i + 1 < text.length() && isDigit(text.charAt(i + 1))) {
                sign = -1;
                i++;
            }
            if (!isDigit(text.charAt(i))) {
                i++;
                continue;
            }
            int value = 0;
            while (i < text.length() && isDigit(text.charAt(i))) {
                value = value * 10 + (text.charAt(i) - '0');
                i++;
            }
            value *= sign;
            if (!found || value > max) {
                max = value;
                found = true;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("No numbers found");
        }
        return max;
    }

    private boolean isDigit(char current) {
        return current >= '0' && current <= '9';
    }
}
