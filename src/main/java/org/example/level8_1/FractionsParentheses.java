package org.example.level8_1;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class FractionsParentheses {

    /** Reads the source file, wraps every fraction like 3/4 in parentheses and writes the result to the target file. */
    public String wrap(Path source, Path target) {
        String result = wrap(FileUtils.readText(source));
        FileUtils.writeText(target, result);
        return result;
    }

    /** Wraps every fraction (digits, a slash, digits) in parentheses: "1/2 and 3" -> "(1/2) and 3". */
    public String wrap(String text) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            if (!isDigit(text.charAt(i))) {
                result.append(text.charAt(i));
                i++;
                continue;
            }
            int start = i;
            i = skipDigits(text, i);
            int afterSlash = i + 1;
            if (i < text.length() && text.charAt(i) == '/' && skipDigits(text, afterSlash) > afterSlash) {
                i = skipDigits(text, afterSlash);
                result.append('(').append(text, start, i).append(')');
            } else {
                result.append(text, start, i);
            }
        }
        return result.toString();
    }

    private int skipDigits(String text, int from) {
        int i = from;
        while (i < text.length() && isDigit(text.charAt(i))) {
            i++;
        }
        return i;
    }

    private boolean isDigit(char current) {
        return current >= '0' && current <= '9';
    }
}
