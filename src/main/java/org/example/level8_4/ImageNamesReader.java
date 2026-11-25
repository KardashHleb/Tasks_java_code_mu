package org.example.level8_4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.example.common.FileUtils;

public class ImageNamesReader {

    private static final String[] IMAGE_EXTENSIONS = {"jpg", "jpeg", "png", "gif", "bmp", "webp"};

    /** Returns the names of the image files directly inside the folder, in alphabetical order. */
    public List<String> names(Path folder) {
        if (!Files.isDirectory(folder)) {
            throw new IllegalArgumentException("Not a folder: " + folder);
        }
        return FileUtils.listFiles(folder).stream()
                .filter(file -> FileUtils.hasExtension(file, IMAGE_EXTENSIONS))
                .map(file -> file.getFileName().toString())
                .toList();
    }
}
