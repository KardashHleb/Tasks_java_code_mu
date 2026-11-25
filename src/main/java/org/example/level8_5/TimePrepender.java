package org.example.level8_5;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.example.common.FileUtils;

public class TimePrepender {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /** Inserts the current date and time as a new first line of the file and returns the new content. */
    public String prepend(Path file) {
        return prepend(file, LocalDateTime.now());
    }

    /** Inserts {@code moment} (yyyy-MM-dd HH:mm:ss) as a new first line of the file and returns the new content. */
    public String prepend(Path file, LocalDateTime moment) {
        String result = moment.format(FORMAT) + "\n" + FileUtils.readText(file);
        FileUtils.writeText(file, result);
        return result;
    }
}
