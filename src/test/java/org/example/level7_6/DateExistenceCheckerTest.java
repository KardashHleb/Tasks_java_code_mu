package org.example.level7_6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateExistenceCheckerTest {

    private final DateExistenceChecker task = new DateExistenceChecker();

    @ParameterizedTest
    @CsvSource({
            "2024-02-29, true", "2023-02-29, false", "2026-04-31, false",
            "2026-12-31, true", "2026-13-01, false", "not a date, false"
    })
    void checksDates(String date, boolean expected) {
        assertEquals(expected, task.exists(date));
    }
}
