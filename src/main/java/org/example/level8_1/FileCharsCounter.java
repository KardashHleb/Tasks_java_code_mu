package org.example.level8_1;

import java.nio.file.Path;
import org.example.common.FileUtils;

public class FileCharsCounter {

    /** Returns the number of characters in a text file (Windows line endings count as one character). */
    public int count(Path file) {
        return FileUtils.readText(file).length();
    }
}
