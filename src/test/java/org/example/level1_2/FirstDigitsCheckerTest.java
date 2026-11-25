package org.example.level1_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstDigitsCheckerTest {

    private final FirstDigitsChecker checker = new FirstDigitsChecker();

    @Test
    void sameFirstDigit() {
        assertTrue(checker.haveSameFirstDigit(123, 1999));
    }

    @Test
    void differentFirstDigit() {
        assertFalse(checker.haveSameFirstDigit(123, 456));
    }

    @Test
    void signIsIgnored() {
        assertTrue(checker.haveSameFirstDigit(-52, 5));
    }
}
