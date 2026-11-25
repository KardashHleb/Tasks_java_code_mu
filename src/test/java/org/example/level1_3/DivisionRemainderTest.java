package org.example.level1_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionRemainderTest {

    private final DivisionRemainder remainder = new DivisionRemainder();

    @ParameterizedTest
    @CsvSource({"10, 3, 1", "9, 3, 0", "0, 5, 0", "-7, 3, -1"})
    void findsRemainder(int dividend, int divisor, int expected) {
        assertEquals(expected, remainder.findRemainder(dividend, divisor));
    }

    @Test
    void rejectsZeroDivisor() {
        assertThrows(IllegalArgumentException.class, () -> remainder.findRemainder(5, 0));
    }
}
