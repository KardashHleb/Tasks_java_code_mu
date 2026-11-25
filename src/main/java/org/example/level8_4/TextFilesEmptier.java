package org.example.level8_4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.example.common.FileUtils;

public class TextFilesEmptier {

    /** Erases the content of every .txt file directly inside the folder and returns their names in alphabetical order. */
    public List<String> clear(Path folder) {
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        List<String> cleared = new ArrayList<>();
        for (Path file : FileUtils.listFiles(folder)) {
            if (FileUtils.hasExtension(file, "txt")) {
                FileUtils.writeText(file, "");
                cleared.add(file.getFileName().toString());
            }
        }
        return cleared;
    }
}
