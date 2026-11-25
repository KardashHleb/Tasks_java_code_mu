package org.example.level9_10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AmicableCheckerTest {

    private final AmicableChecker task = new AmicableChecker();

    @Test
    void recognizesAmicablePairs() {
        assertTrue(task.areAmicable(220, 284));
        assertTrue(task.areAmicable(1210, 1184));
    }

    @Test
    void rejectsNonAmicableAndPerfectNumbers() {
        assertFalse(task.areAmicable(220, 285));
        assertFalse(task.areAmicable(6, 6));
        assertFalse(task.areAmicable(1, 1));
    }

    @Test
    void rejectsNonPositiveNumbers() {
        assertThrows(IllegalArgumentException.class, () -> task.areAmicable(0, 284));
        assertThrows(IllegalArgumentException.class, () -> task.areAmicable(220, -284));
    }
}
