package org.example.level2_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateFromArrayFormatterTest {

    private final DateFromArrayFormatter formatter = new DateFromArrayFormatter();

    @Test
    void formatsDate() {
        assertEquals("31-12-2025", formatter.format(new String[] {"2025", "12", "31"}));
    }

    @Test
    void padsSingleDigits() {
        assertEquals("05-03-2024", formatter.format(new String[] {"2024", "3", "5"}));
    }

    @Test
    void rejectsImpossibleDate() {
        assertThrows(IllegalArgumentException.class, () -> formatter.format(new String[] {"2023", "2", "29"}));
    }

    @Test
    void rejectsWrongLength() {
        assertThrows(IllegalArgumentException.class, () -> formatter.format(new String[] {"2025", "12"}));
    }
}
