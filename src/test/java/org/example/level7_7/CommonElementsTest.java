package org.example.level7_7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CommonElementsTest {

    private final CommonElements task = new CommonElements();

    @Test
    void findsCommonValuesWithoutDuplicates() {
        assertArrayEquals(new int[] {3, 1}, task.common(new int[] {3, 1, 3, 5, 1}, new int[] {1, 2, 3}));
    }

    @Test
    void returnsEmptyWhenNothingInCommon() {
        assertArrayEquals(new int[0], task.common(new int[] {1, 2}, new int[] {3, 4}));
        assertArrayEquals(new int[0], task.common(new int[0], new int[] {1}));
    }
}
