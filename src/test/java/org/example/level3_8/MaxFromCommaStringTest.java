package org.example.level3_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MaxFromCommaStringTest {

    private final MaxFromCommaString task = new MaxFromCommaString();

    @Test
    void findsMax() {
        assertEquals(17, task.findMax("3,17,-4,9"));
    }

    @Test
    void allNegative() {
        assertEquals(-2, task.findMax("-5,-2,-9"));
    }

    @Test
    void emptyStringIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.findMax(""));
    }
}
