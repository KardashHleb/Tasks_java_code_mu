package org.example.level4_6;

import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastEvenDigitTest {

    private final LastEvenDigit task = new LastEvenDigit();

    @Test
    void findsRightmostEvenDigit() {
        assertEquals(OptionalInt.of(4), task.find(12345));
    }

    @Test
    void zeroAndNegative() {
        assertEquals(OptionalInt.of(0), task.find(0));
        assertEquals(OptionalInt.of(8), task.find(-283));
    }

    @Test
    void allOddDigits() {
        assertEquals(OptionalInt.empty(), task.find(13579));
    }
}
