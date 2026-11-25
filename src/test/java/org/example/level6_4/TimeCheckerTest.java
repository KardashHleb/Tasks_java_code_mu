package org.example.level6_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "12:30:45, true",
            "00:00:00, true",
            "23:59:59, true",
            "24:00:00, false",
            "12:60:00, false",
            "1:30:45, false",
            "12-30-45, false",
            "ab:cd:ef, false"
    })
    void checksTime(String time, boolean expected) {
        assertEquals(expected, new TimeChecker().isCorrect(time));
    }
}
