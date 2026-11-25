package org.example.level4_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstDigitPositionTest {

    private final FirstDigitPosition task = new FirstDigitPosition();

    @ParameterizedTest
    @CsvSource({"abc1d2, 3", "7up, 0", "letters, -1", "'', -1"})
    void findsFirstDigit(String str, int expected) {
        assertEquals(expected, task.findFirstDigit(str));
    }
}
