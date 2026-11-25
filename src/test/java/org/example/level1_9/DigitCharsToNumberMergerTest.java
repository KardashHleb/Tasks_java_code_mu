package org.example.level1_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitCharsToNumberMergerTest {

    private final DigitCharsToNumberMerger merger = new DigitCharsToNumberMerger();

    @Test
    void mergesDigits() {
        assertEquals(123, merger.mergeToNumber('1', '2', '3'));
    }

    @Test
    void leadingZeros() {
        assertEquals(7, merger.mergeToNumber('0', '0', '7'));
    }

    @Test
    void rejectsNonDigit() {
        assertThrows(IllegalArgumentException.class, () -> merger.mergeToNumber('1', '-', '3'));
    }
}
