package org.example.level7_6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class NumbersDivisorsTest {

    private final NumbersDivisors task = new NumbersDivisors();

    @Test
    void replacesNumbersWithDivisors() {
        int[][] expected = {{1, 2, 3, 6}, {1}, {1, 7}, {1, 2, 4}};
        assertArrayEquals(expected, task.divisorsOf(new int[] {6, 1, 7, -4}));
    }

    @Test
    void handlesEmptyArray() {
        assertArrayEquals(new int[0][], task.divisorsOf(new int[0]));
    }

    @Test
    void rejectsZero() {
        assertThrows(IllegalArgumentException.class, () -> task.divisorsOf(new int[] {3, 0}));
    }
}
