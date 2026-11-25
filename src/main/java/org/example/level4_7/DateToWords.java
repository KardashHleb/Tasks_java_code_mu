package org.example.level4_7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

public class DateToWords {

    private static final DateTimeFormatter INPUT =
            DateTimeFormatter.ofPattern("dd-MM-uuuu").withResolverStyle(ResolverStyle.STRICT);
    private static final DateTimeFormatter OUTPUT = DateTimeFormatter.ofPattern("d MMMM uuuu", Locale.ENGLISH);

    /** Converts a date in the "dd-mm-yyyy" format to words, e.g. "31-12-2025" gives "31 December 2025". */
    public String convert(String date) {
        try {
            return LocalDate.parse(date, INPUT).format(OUTPUT);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Expected a valid date in the dd-mm-yyyy format, got \"" + date + "\"", e);
        }
    }
}
