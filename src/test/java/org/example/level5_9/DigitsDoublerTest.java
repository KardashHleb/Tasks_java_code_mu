package org.example.level5_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitsDoublerTest {

    private final DigitsDoubler doubler = new DigitsDoubler();

    @ParameterizedTest
    @CsvSource({"1234, 11223344", "0, 0", "105, 110055", "-12, -1122", "999999999, 999999999999999999"})
    void doublesDigits(int number, long expected) {
        assertEquals(expected, doubler.doubleDigits(number));
    }

    @Test
    void rejectsTenDigitNumbers() {
        assertThrows(IllegalArgumentException.class, () -> doubler.doubleDigits(1_000_000_000));
    }
}
