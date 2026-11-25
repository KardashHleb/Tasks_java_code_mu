package org.example.level7_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LeapYearMethodTest {

    private final LeapYearMethod task = new LeapYearMethod();

    @ParameterizedTest
    @CsvSource({"2024, true", "2023, false", "1900, false", "2000, true"})
    void detectsLeapYears(int year, boolean expected) {
        assertEquals(expected, task.isLeap(year));
    }
}
