package org.example.level2_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MonthNameFinderTest {

    private final MonthNameFinder finder = new MonthNameFinder();

    @ParameterizedTest
    @CsvSource({"1, January", "5, May", "12, December"})
    void findsMonthName(int month, String expected) {
        assertEquals(expected, finder.monthName(month));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 13})
    void rejectsInvalidMonth(int month) {
        assertThrows(IllegalArgumentException.class, () -> finder.monthName(month));
    }
}
