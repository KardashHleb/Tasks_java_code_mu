package org.example.level8_10;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

public class FolderCopier {

    /**
     * Copies the folder with all its files and subfolders to the target path (existing files are replaced)
     * and returns the target. Parents are visited before children, so every folder exists before its files.
     */
    public Path copy(Path source, Path target) {
        if (!Files.isDirectory(source)) {
            throw new IllegalArgumentException("Not a folder: " + source);
        }
        if (target.toAbsolutePath().normalize().startsWith(source.toAbsolutePath().normalize())) {
            throw new IllegalArgumentException("Cannot copy a folder into itself: " + target);
        }
        try {
            List<Path> paths;
            try (Stream<Path> walk = Files.walk(source)) {
                paths = walk.toList();
            }
            for (Path path : paths) {
                Path destination = target.resolve(source.relativize(path).toString());
                if (Files.isDirectory(path)) {
                    Files.createDirectories(destination);
                } else {
                    Files.copy(path, destination, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return target;
    }
}
