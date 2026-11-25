package org.example.level3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NegativeCountTest {

    private final NegativeCount task = new NegativeCount();

    @Test
    void countsNegatives() {
        assertEquals(3, task.countNegative(new int[]{-1, 2, -3, 0, -5}));
    }

    @Test
    void zeroIsNotNegative() {
        assertEquals(0, task.countNegative(new int[]{0, 1, 2}));
    }

    @Test
    void emptyArray() {
        assertEquals(0, task.countNegative(new int[0]));
    }
}
