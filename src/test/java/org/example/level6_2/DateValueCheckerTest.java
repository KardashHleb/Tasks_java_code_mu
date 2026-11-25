package org.example.level6_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateValueCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "2025-05-17, true",
            "2024-02-29, true",
            "2023-02-29, false",
            "2025-13-01, false",
            "2025-5-17, false",
            "hello, false"
    })
    void checksDate(String date, boolean expected) {
        assertEquals(expected, new DateValueChecker().isCorrect(date));
    }
}
