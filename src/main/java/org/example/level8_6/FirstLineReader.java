package org.example.level8_6;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;

public class FirstLineReader {

    /** Returns the first line of a text file, or an empty string for an empty file. */
    public String read(Path file) {
        List<String> lines = FileUtils.readLines(file);
        return lines.isEmpty() ? "" : lines.get(0);
    }
}
