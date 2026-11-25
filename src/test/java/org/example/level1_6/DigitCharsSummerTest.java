package org.example.level1_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitCharsSummerTest {

    private final DigitCharsSummer summer = new DigitCharsSummer();

    @Test
    void sumsDigits() {
        assertEquals(6, summer.sumDigitChars('1', '2', '3'));
    }

    @Test
    void zeros() {
        assertEquals(0, summer.sumDigitChars('0', '0', '0'));
    }

    @Test
    void rejectsNonDigit() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumDigitChars('1', 'a', '3'));
    }
}
