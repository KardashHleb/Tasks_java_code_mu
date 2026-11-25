package org.example.level7_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateWeekdayWordTest {

    private final DateWeekdayWord task = new DateWeekdayWord();

    @ParameterizedTest
    @CsvSource({"2024-01-01, Monday", "2024-02-29, Thursday", "2026-11-29, Sunday"})
    void returnsWeekdayName(String date, String expected) {
        assertEquals(expected, task.weekday(date));
    }

    @Test
    void rejectsNonExistentDate() {
        assertThrows(IllegalArgumentException.class, () -> task.weekday("2023-02-29"));
    }
}
