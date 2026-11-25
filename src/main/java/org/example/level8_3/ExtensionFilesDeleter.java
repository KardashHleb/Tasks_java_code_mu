package org.example.level8_3;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.example.common.FileUtils;

public class ExtensionFilesDeleter {

    /**
     * Deletes the files with the given extension (case-insensitive, with or without a leading dot) directly
     * inside the folder and returns their names in alphabetical order.
     */
    public List<String> delete(Path folder, String extension) {
        String bareExtension = extension.startsWith(".") ? extension.substring(1) : extension;
        if (bareExtension.isBlank()) {
            throw new IllegalArgumentException("Extension must not be empty");
        }
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        List<String> deleted = new ArrayList<>();
        for (Path file : FileUtils.listFiles(folder)) {
            if (FileUtils.hasExtension(file, bareExtension)) {
                try {
                    Files.delete(file);
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
                deleted.add(file.getFileName().toString());
            }
        }
        return deleted;
    }
}
