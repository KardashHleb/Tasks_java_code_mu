package org.example.level9_2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DigitRowsToNumbersTest {

    private final DigitRowsToNumbers task = new DigitRowsToNumbers();

    @Test
    void joinsDigitsOfEveryRow() {
        assertArrayEquals(new long[]{123, 45, 7}, task.join(new int[][]{{1, 2, 3}, {4, 5}, {7}}));
    }

    @Test
    void handlesLeadingZerosAndEmptyRows() {
        assertArrayEquals(new long[]{5, 0}, task.join(new int[][]{{0, 0, 5}, {}}));
    }

    @Test
    void rejectsNonDigits() {
        assertThrows(IllegalArgumentException.class, () -> task.join(new int[][]{{1, 12}}));
    }
}
