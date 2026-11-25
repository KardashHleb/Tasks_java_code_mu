package org.example.level8_5;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import org.example.common.FileUtils;

public class FileSizesReader {

    /** Returns the size in bytes of every file directly inside the folder, keyed by file name in alphabetical order. */
    public Map<String, Long> sizes(Path folder) {
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        Map<String, Long> result = new LinkedHashMap<>();
        try {
            for (Path file : FileUtils.listFiles(folder)) {
                result.put(file.getFileName().toString(), Files.size(file));
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return result;
    }
}
