package org.example.level3_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllContainDigitThreeCheckerTest {

    private final AllContainDigitThreeChecker checker = new AllContainDigitThreeChecker();

    @Test
    void allContainThree() {
        assertTrue(checker.allContainThree(new int[]{3, 13, -301, 123}));
    }

    @Test
    void oneWithoutThree() {
        assertFalse(checker.allContainThree(new int[]{3, 13, 0}));
    }

    @Test
    void emptyArray() {
        assertTrue(checker.allContainThree(new int[0]));
    }
}
