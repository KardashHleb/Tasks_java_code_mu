package org.example.level7_3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class AdjacentDuplicatesRemoverTest {

    private final AdjacentDuplicatesRemover task = new AdjacentDuplicatesRemover();

    @Test
    void collapsesRuns() {
        assertArrayEquals(new int[] {1, 2, 1, 3}, task.remove(new int[] {1, 1, 2, 2, 2, 1, 3, 3}));
    }

    @Test
    void keepsNonAdjacentDuplicates() {
        assertArrayEquals(new int[] {1, 2, 1}, task.remove(new int[] {1, 2, 1}));
    }

    @Test
    void handlesEmptyArray() {
        assertArrayEquals(new int[0], task.remove(new int[0]));
    }
}
