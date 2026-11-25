package org.example.level6_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateFormatCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "2025-05-17, true",
            "2025-13-45, true",
            "2025-5-17, false",
            "2025/05/17, false",
            "25-05-2017, false",
            "abcd-ef-gh, false",
            "'', false"
    })
    void checksFormat(String text, boolean expected) {
        assertEquals(expected, new DateFormatChecker().isCorrectFormat(text));
    }
}
