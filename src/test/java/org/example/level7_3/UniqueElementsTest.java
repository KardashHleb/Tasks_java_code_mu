package org.example.level7_3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class UniqueElementsTest {

    private final UniqueElements task = new UniqueElements();

    @Test
    void keepsFirstOccurrences() {
        assertArrayEquals(new int[] {3, 1, 2}, task.unique(new int[] {3, 1, 3, 2, 1, 3}));
    }

    @Test
    void handlesEmptyAndAlreadyUnique() {
        assertArrayEquals(new int[0], task.unique(new int[0]));
        assertArrayEquals(new int[] {1, 2, 3}, task.unique(new int[] {1, 2, 3}));
    }
}
