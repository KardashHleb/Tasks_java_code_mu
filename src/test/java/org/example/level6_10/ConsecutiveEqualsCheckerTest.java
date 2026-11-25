package org.example.level6_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConsecutiveEqualsCheckerTest {

    private final ConsecutiveEqualsChecker checker = new ConsecutiveEqualsChecker();

    @Test
    void findsNeighbours() {
        assertTrue(checker.hasConsecutiveEquals(new int[]{1, 2, 2, 3}));
        assertTrue(checker.hasConsecutiveEquals(new int[]{5, 1, 4, 4}));
    }

    @Test
    void equalButNotAdjacent() {
        assertFalse(checker.hasConsecutiveEquals(new int[]{1, 2, 1, 2}));
    }

    @Test
    void shortArrays() {
        assertFalse(checker.hasConsecutiveEquals(new int[0]));
        assertFalse(checker.hasConsecutiveEquals(new int[]{7}));
    }
}
