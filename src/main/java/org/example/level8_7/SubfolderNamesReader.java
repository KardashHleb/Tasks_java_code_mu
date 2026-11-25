package org.example.level8_7;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class SubfolderNamesReader {

    /** Returns the names of the folders directly inside the folder, in alphabetical order. */
    public List<String> names(Path folder) {
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        try (Stream<Path> children = Files.list(folder)) {
            return children.filter(Files::isDirectory)
                    .map(child -> child.getFileName().toString())
                    .sorted()
                    .toList();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
