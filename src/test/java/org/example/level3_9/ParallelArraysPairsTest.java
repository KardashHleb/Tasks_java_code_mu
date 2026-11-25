package org.example.level3_9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ParallelArraysPairsTest {

    private final ParallelArraysPairs task = new ParallelArraysPairs();

    @Test
    void pairsSameLengthArrays() {
        assertIterableEquals(List.of("1,4", "2,5", "3,6"), task.toPairs(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    void longerArrayIsTruncated() {
        assertIterableEquals(List.of("1,9"), task.toPairs(new int[]{1, 2, 3}, new int[]{9}));
    }

    @Test
    void emptyArray() {
        assertIterableEquals(List.of(), task.toPairs(new int[0], new int[]{1}));
    }
}
