package org.example.level6_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearCheckerTest {

    @ParameterizedTest
    @CsvSource({"2024, true", "2023, false", "1900, false", "2000, true", "0, true"})
    void checksLeapYear(int year, boolean expected) {
        assertEquals(expected, new LeapYearChecker().isLeap(year));
    }
}
