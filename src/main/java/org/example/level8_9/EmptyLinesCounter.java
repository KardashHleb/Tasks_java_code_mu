package org.example.level8_9;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class EmptyLinesCounter {

    /** Returns how many empty lines the file has; a trailing newline does not count as an extra empty line. */
    public int count(Path file) {
        int result = 0;
        for (String line : FileUtils.readLines(file)) {
            if (line.isEmpty()) {
                result++;
            }
        }
        return result;
    }
}
