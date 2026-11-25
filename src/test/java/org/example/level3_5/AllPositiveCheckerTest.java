package org.example.level3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AllPositiveCheckerTest {

    private final AllPositiveChecker checker = new AllPositiveChecker();

    @Test
    void allPositive() {
        assertTrue(checker.allPositive(new int[]{1, 2, 3}));
    }

    @Test
    void zeroIsNotPositive() {
        assertFalse(checker.allPositive(new int[]{1, 0, 3}));
    }

    @Test
    void emptyArrayIsVacuouslyPositive() {
        assertTrue(checker.allPositive(new int[0]));
    }
}
