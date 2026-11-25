package org.example.level6_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateCorrectnessCheckerTest {

    @ParameterizedTest
    @CsvSource({"2025-12-31, true", "2000-02-29, true", "1900-02-29, false", "2025-04-31, false", "2025-00-10, false"})
    void checksDate(String date, boolean expected) {
        assertEquals(expected, new DateCorrectnessChecker().isCorrect(date));
    }
}
