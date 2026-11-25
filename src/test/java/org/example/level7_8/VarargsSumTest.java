package org.example.level7_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VarargsSumTest {

    private final VarargsSum task = new VarargsSum();

    @Test
    void sumsArguments() {
        assertEquals(10, task.sum(1, 2, 3, 4));
        assertEquals(-1, task.sum(2, -3));
    }

    @Test
    void returnsZeroWithoutArguments() {
        assertEquals(0, task.sum());
    }
}
