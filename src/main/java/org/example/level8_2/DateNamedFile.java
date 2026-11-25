package org.example.level8_2;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateNamedFile {

    /** Creates an empty file named after the current date (yyyy-MM-dd.txt) in the folder. */
    public Path create(Path folder) {
        return create(folder, LocalDate.now());
    }

    /** Creates an empty file named yyyy-MM-dd.txt for the given date in the folder; an existing file is kept. */
    public Path create(Path folder, LocalDate date) {
        Path file = folder.resolve(date.format(DateTimeFormatter.ISO_LOCAL_DATE) + ".txt");
        try {
            Files.createDirectories(folder);
            if (Files.notExists(file)) {
                Files.createFile(file);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return file;
    }
}
