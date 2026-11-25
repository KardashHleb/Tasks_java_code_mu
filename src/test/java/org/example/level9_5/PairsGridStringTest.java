package org.example.level9_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PairsGridStringTest {

    private final PairsGridString task = new PairsGridString();

    @Test
    void buildsDefaultGrid() {
        assertEquals("11 12 13 21 22 23 31 32 33", task.make());
    }

    @Test
    void buildsSmallerGrids() {
        assertEquals("11", task.make(1));
        assertEquals("11 12 21 22", task.make(2));
    }

    @Test
    void rejectsInvalidSize() {
        assertThrows(IllegalArgumentException.class, () -> task.make(0));
        assertThrows(IllegalArgumentException.class, () -> task.make(10));
    }
}
