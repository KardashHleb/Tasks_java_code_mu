package org.example.level8_10;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;
import org.example.common.FileUtils;

public class FilePathsWriter {

    /**
     * Writes the paths of all files in the folder and its subfolders, relative to the folder, with '/' as the
     * separator and in alphabetical order, one per line to the target file, and returns them.
     */
    public List<String> write(Path folder, Path target) {
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        List<String> paths;
        try (Stream<Path> walk = Files.walk(folder)) {
            paths = walk.filter(Files::isRegularFile)
                    .map(file -> folder.relativize(file).toString().replace('\\', '/'))
                    .sorted()
                    .toList();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        FileUtils.writeLines(target, paths);
        return paths;
    }
}
