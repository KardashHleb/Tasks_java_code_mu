package org.example.level2_9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DayTypeDeterminerTest {

    private final DayTypeDeterminer determiner = new DayTypeDeterminer();

    @ParameterizedTest
    @CsvSource({"1, Weekday", "5, Weekday", "6, Weekend", "7, Weekend"})
    void determinesDayType(int day, String expected) {
        assertEquals(expected, determiner.determine(day));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 8})
    void rejectsInvalidDay(int day) {
        assertThrows(IllegalArgumentException.class, () -> determiner.determine(day));
    }
}
