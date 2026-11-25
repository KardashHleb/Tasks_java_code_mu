package org.example.level1_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitCounterTest {

    private final DigitCounter counter = new DigitCounter();

    @ParameterizedTest
    @CsvSource({"12345, 5", "0, 1", "-987, 3", "-2147483648, 10"})
    void countsDigits(int number, int expected) {
        assertEquals(expected, counter.countDigits(number));
    }
}
