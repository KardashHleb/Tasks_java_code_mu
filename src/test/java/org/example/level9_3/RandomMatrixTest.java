package org.example.level9_3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

class RandomMatrixTest {

    private final RandomMatrix task = new RandomMatrix();

    @Test
    void hasRequestedSizeAndDigits() {
        int[][] matrix = task.make(3, 4, new Random(1));
        assertEquals(3, matrix.length);
        for (int[] row : matrix) {
            assertEquals(4, row.length);
            for (int value : row) {
                assertTrue(value >= 0 && value <= 9);
            }
        }
    }

    @Test
    void sameSeedGivesSameMatrix() {
        assertArrayEquals(task.make(2, 2, new Random(42)), task.make(2, 2, new Random(42)));
    }

    @Test
    void rejectsNegativeSize() {
        assertThrows(IllegalArgumentException.class, () -> task.make(-1, 2, new Random()));
    }
}
