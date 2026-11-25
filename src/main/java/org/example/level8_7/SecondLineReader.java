package org.example.level8_7;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;

public class SecondLineReader {

    /** Returns the second line of a text file. */
    public String read(Path file) {
        List<String> lines = FileUtils.readLines(file);
        if (lines.size() < 2) {
            throw new IllegalArgumentException("File has fewer than two lines: " + file);
        }
        return lines.get(1);
    }
}
