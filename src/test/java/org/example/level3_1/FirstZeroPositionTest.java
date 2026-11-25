package org.example.level3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstZeroPositionTest {

    private final FirstZeroPosition task = new FirstZeroPosition();

    @Test
    void findsFirstOfSeveralZeros() {
        assertEquals(2, task.findFirstZero(new int[]{1, 2, 0, 3, 0}));
    }

    @Test
    void noZeroGivesMinusOne() {
        assertEquals(-1, task.findFirstZero(new int[]{1, 2, 3}));
    }

    @Test
    void emptyArrayGivesMinusOne() {
        assertEquals(-1, task.findFirstZero(new int[0]));
    }
}
