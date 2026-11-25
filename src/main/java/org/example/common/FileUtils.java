package org.example.common;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Small file helpers shared by the file-based tasks. All text is read and written as UTF-8,
 * and Windows line endings are normalized to {@code \n} on read.
 */
public final class FileUtils {

    private FileUtils() {
    }

    public static String readText(Path path) {
        try {
            return Files.readString(path, StandardCharsets.UTF_8).replace("\r", "");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static void writeText(Path path, String text) {
        try {
            Path parent = path.toAbsolutePath().getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
            Files.writeString(path, text, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** Lines of the file without line terminators; a trailing newline does not produce an empty last line. */
    public static List<String> readLines(Path path) {
        String text = readText(path);
        if (text.isEmpty()) {
            return List.of();
        }
        return text.lines().toList();
    }

    public static void writeLines(Path path, List<String> lines) {
        writeText(path, String.join("\n", lines));
    }

    /** Regular files directly inside {@code folder}, sorted by name. */
    public static List<Path> listFiles(Path folder) {
        try (Stream<Path> stream = Files.list(folder)) {
            return stream.filter(Files::isRegularFile).sorted().toList();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static boolean hasExtension(Path path, String... extensions) {
        String name = path.getFileName().toString().toLowerCase();
        for (String extension : extensions) {
            if (name.endsWith("." + extension.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
