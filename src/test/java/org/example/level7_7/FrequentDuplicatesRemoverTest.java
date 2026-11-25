package org.example.level7_7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class FrequentDuplicatesRemoverTest {

    private final FrequentDuplicatesRemover task = new FrequentDuplicatesRemover();

    @Test
    void removesValuesOccurringMoreThanThreeTimes() {
        assertArrayEquals(new int[] {2, 3, 2, 3, 3},
                task.remove(new int[] {1, 2, 1, 3, 1, 2, 3, 1, 3}));
    }

    @Test
    void keepsValuesOccurringExactlyThreeTimes() {
        assertArrayEquals(new int[] {5, 5, 5}, task.remove(new int[] {5, 5, 5}));
    }

    @Test
    void handlesEmptyArray() {
        assertArrayEquals(new int[0], task.remove(new int[0]));
    }
}
