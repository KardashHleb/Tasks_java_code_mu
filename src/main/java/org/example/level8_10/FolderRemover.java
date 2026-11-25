package org.example.level8_10;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FolderRemover {

    /**
     * Deletes the folder together with everything inside it. Paths are deleted deepest first, so every folder
     * is already empty when its turn comes.
     */
    public void remove(Path folder) {
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        if (folder.toAbsolutePath().normalize().getParent() == null) {
            throw new IllegalArgumentException("Refusing to delete a root folder: " + folder);
        }
        try {
            List<Path> paths;
            try (Stream<Path> walk = Files.walk(folder)) {
                paths = walk.sorted(Comparator.reverseOrder()).toList();
            }
            for (Path path : paths) {
                Files.delete(path);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
