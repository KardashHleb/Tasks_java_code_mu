package org.example.level1_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HourQuarterDeterminerTest {

    private final HourQuarterDeterminer determiner = new HourQuarterDeterminer();

    @ParameterizedTest
    @CsvSource({"0, First quarter", "14, First quarter", "15, Second quarter", "30, Third quarter", "59, Fourth quarter"})
    void determinesQuarter(int minute, String expected) {
        assertEquals(expected, determiner.determineQuarter(minute));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 60})
    void rejectsInvalidMinute(int minute) {
        assertThrows(IllegalArgumentException.class, () -> determiner.determineQuarter(minute));
    }
}
