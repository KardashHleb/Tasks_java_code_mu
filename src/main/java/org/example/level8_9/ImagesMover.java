package org.example.level8_9;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.example.common.FileUtils;

public class ImagesMover {

    private static final String[] IMAGE_EXTENSIONS = {"jpg", "jpeg", "png", "gif", "bmp", "webp"};

    /**
     * Moves every image file from the source folder and all its subfolders into the target folder and returns
     * the new paths. When a name is already taken, a suffix is added: photo.jpg, photo_2.jpg, photo_3.jpg...
     */
    public List<Path> move(Path source, Path target) {
        if (!Files.isDirectory(source)) {
            throw new IllegalArgumentException("Not a folder: " + source);
        }
        try {
            Files.createDirectories(target);
            Path targetFolder = target.toAbsolutePath().normalize();
            List<Path> images;
            try (Stream<Path> paths = Files.walk(source)) {
                // images already in the target folder (when it lies inside the source) stay where they are
                images = paths.filter(Files::isRegularFile)
                        .filter(file -> FileUtils.hasExtension(file, IMAGE_EXTENSIONS))
                        .filter(file -> !file.toAbsolutePath().normalize().getParent().equals(targetFolder))
                        .sorted()
                        .toList();
            }
            List<Path> moved = new ArrayList<>();
            for (Path image : images) {
                moved.add(Files.move(image, freeName(target, image.getFileName().toString())));
            }
            return moved;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private Path freeName(Path folder, String name) {
        Path candidate = folder.resolve(name);
        int dot = name.lastIndexOf('.');
        String base = dot < 0 ? name : name.substring(0, dot);
        String extension = dot < 0 ? "" : name.substring(dot);
        for (int suffix = 2; Files.exists(candidate); suffix++) {
            candidate = folder.resolve(base + "_" + suffix + extension);
        }
        return candidate;
    }
}
