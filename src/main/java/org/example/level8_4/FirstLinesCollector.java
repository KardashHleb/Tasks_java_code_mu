package org.example.level8_4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.example.common.FileUtils;

public class FirstLinesCollector {

    /**
     * Takes the first {@code count} lines of every .txt file directly inside the folder (files in
     * alphabetical order), writes them to the target file and returns the written text.
     */
    public String collect(Path folder, int count, Path target) {
        if (count < 0) {
            throw new IllegalArgumentException("Count must not be negative: " + count);
        }
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        List<String> collected = new ArrayList<>();
        for (Path file : FileUtils.listFiles(folder)) {
            if (FileUtils.hasExtension(file, "txt")) {
                List<String> lines = FileUtils.readLines(file);
                collected.addAll(lines.subList(0, Math.min(count, lines.size())));
            }
        }
        String result = String.join("\n", collected);
        FileUtils.writeText(target, result);
        return result;
    }
}
