package org.example.level8_5;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class NamedFoldersCreator {

    /** Creates subfolders with the given names inside the folder (existing ones are kept) and returns their paths. */
    public List<Path> create(Path folder, List<String> names) {
        for (String name : names) {
            if (name.isBlank()) {
                throw new IllegalArgumentException("Folder name must not be blank");
            }
        }
        List<Path> created = new ArrayList<>();
        try {
            for (String name : names) {
                created.add(Files.createDirectories(folder.resolve(name)));
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return created;
    }
}
