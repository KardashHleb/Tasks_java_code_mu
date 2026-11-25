package org.example.level8_3;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class FileNumbersSquarer {

    /** Replaces every number in the file with its square, rewriting the file in place, and returns the new text. */
    public String square(Path file) {
        String result = square(FileUtils.readText(file));
        FileUtils.writeText(file, result);
        return result;
    }

    /** Replaces every run of digits in the text with the square of the number it forms; other text is kept. */
    public String square(String text) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (!isDigit(text.charAt(i))) {
                result.append(text.charAt(i));
                i++;
                continue;
            }
            long value = 0;
            while (i < text.length() && isDigit(text.charAt(i))) {
                value = value * 10 + (text.charAt(i) - '0');
                i++;
            }
            result.append(value * value);
        }
        return result.toString();
    }

    private boolean isDigit(char current) {
        return current >= '0' && current <= '9';
    }
}
