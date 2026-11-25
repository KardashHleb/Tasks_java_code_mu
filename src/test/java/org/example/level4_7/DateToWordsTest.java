package org.example.level4_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DateToWordsTest {

    private final DateToWords task = new DateToWords();

    @ParameterizedTest
    @CsvSource({"31-12-2025, 31 December 2025", "05-01-2024, 5 January 2024", "29-02-2024, 29 February 2024"})
    void convertsDate(String date, String expected) {
        assertEquals(expected, task.convert(date));
    }

    @ParameterizedTest
    @ValueSource(strings = {"2025-12-31", "31-13-2025", "29-02-2023", ""})
    void invalidDateIsRejected(String date) {
        assertThrows(IllegalArgumentException.class, () -> task.convert(date));
    }
}
