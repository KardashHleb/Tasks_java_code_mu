package org.example.level2_7;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFromArrayFormatter {

    private static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /** Formats an array {year, month, day} as "dd-MM-yyyy". */
    public String format(String[] parts) {
        if (parts == null || parts.length != 3) {
            throw new IllegalArgumentException("Expected exactly three parts: year, month, day");
        }
        try {
            LocalDate date = LocalDate.of(
                    Integer.parseInt(parts[0].trim()),
                    Integer.parseInt(parts[1].trim()),
                    Integer.parseInt(parts[2].trim()));
            return date.format(FORMAT);
        } catch (NumberFormatException | DateTimeException | NullPointerException e) {
            throw new IllegalArgumentException("Invalid date parts: " + String.join(", ", parts), e);
        }
    }
}
