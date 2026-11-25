package org.example.level8_4;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.example.common.FileUtils;

public class TimeAppender {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /** Appends the current date and time as a new last line of the file and returns the new content. */
    public String append(Path file) {
        return append(file, LocalDateTime.now());
    }

    /** Appends {@code moment} (yyyy-MM-dd HH:mm:ss) as a new last line of the file and returns the new content. */
    public String append(Path file, LocalDateTime moment) {
        String text = FileUtils.readText(file);
        String separator = text.isEmpty() || text.endsWith("\n") ? "" : "\n";
        String result = text + separator + moment.format(FORMAT);
        FileUtils.writeText(file, result);
        return result;
    }
}
