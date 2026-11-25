package org.example.level8_4;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NamedFilesCreator {

    /** Creates empty files with the given names inside the folder (existing files are kept) and returns their paths. */
    public List<Path> create(Path folder, List<String> names) {
        for (String name : names) {
            if (name.isBlank()) {
                throw new IllegalArgumentException("File name must not be blank");
            }
        }
        List<Path> created = new ArrayList<>();
        try {
            for (String name : names) {
                Path file = folder.resolve(name);
                Files.createDirectories(file.getParent());
                if (Files.notExists(file)) {
                    Files.createFile(file);
                }
                created.add(file);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return created;
    }
}
