package org.example.level4_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitCharsToIntTest {

    private final DigitCharsToInt task = new DigitCharsToInt();

    @Test
    void combinesDigits() {
        assertEquals(1234, task.toInt(new char[]{'1', '2', '3', '4'}));
    }

    @Test
    void leadingZero() {
        assertEquals(5, task.toInt(new char[]{'0', '5'}));
    }

    @Test
    void invalidInputIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.toInt(new char[]{'1', 'a'}));
        assertThrows(IllegalArgumentException.class, () -> task.toInt(new char[0]));
    }
}
