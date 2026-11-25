package org.example.level7_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SecondsToFullDaysTest {

    private final SecondsToFullDays task = new SecondsToFullDays();

    @ParameterizedTest
    @CsvSource({"0, 0", "86399, 0", "86400, 1", "300000, 3"})
    void countsFullDays(long seconds, long expected) {
        assertEquals(expected, task.toDays(seconds));
    }

    @Test
    void rejectsNegative() {
        assertThrows(IllegalArgumentException.class, () -> task.toDays(-1));
    }
}
