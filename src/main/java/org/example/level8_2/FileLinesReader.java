package org.example.level8_2;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;

public class FileLinesReader {

    /** Returns the lines of a text file; a trailing newline does not add an empty last line. */
    public List<String> read(Path file) {
        return FileUtils.readLines(file);
    }
}
