package org.example.level8_10;

import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;

public class BlankEdgesChecker {

    /** Returns true if the file starts with exactly one empty line and ends with exactly two empty lines. */
    public boolean check(Path file) {
        return check(FileUtils.readLines(file));
    }

    /**
     * Returns true if the first line is empty and the second is not, and the last two lines are empty while
     * the third from the end is not.
     */
    public boolean check(List<String> lines) {
        int size = lines.size();
        return size >= 4
                && lines.get(0).isEmpty()
                && !lines.get(1).isEmpty()
                && lines.get(size - 1).isEmpty()
                && lines.get(size - 2).isEmpty()
                && !lines.get(size - 3).isEmpty();
    }
}
