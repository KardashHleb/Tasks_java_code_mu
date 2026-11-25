package org.example.level8_6;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.example.common.FileUtils;

public class LinesShuffler {

    /** Shuffles the lines of the file in place and returns them in their new order. */
    public List<String> shuffle(Path file) {
        return shuffle(file, new Random());
    }

    /** Same as {@link #shuffle(Path)} with a caller-supplied random generator. */
    public List<String> shuffle(Path file, Random random) {
        List<String> lines = new ArrayList<>(FileUtils.readLines(file));
        Collections.shuffle(lines, random);
        FileUtils.writeLines(file, lines);
        return lines;
    }
}
