package org.example.level4_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDigitThreeCheckerTest {

    private final ContainsDigitThreeChecker checker = new ContainsDigitThreeChecker();

    @Test
    void oneNumberContainsThree() {
        assertTrue(checker.anyContainsThree(new int[]{1, 22, -431}));
    }

    @Test
    void noneContainsThree() {
        assertFalse(checker.anyContainsThree(new int[]{0, 12, 45}));
    }

    @Test
    void emptyArray() {
        assertFalse(checker.anyContainsThree(new int[0]));
    }
}
