package org.example.level7_8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

class NoAdjacentRandomFillerTest {

    private final NoAdjacentRandomFiller task = new NoAdjacentRandomFiller();

    @Test
    void neighboursDifferAndValuesStayInRange() {
        int[] result = task.fill(300, 1, 2, new Random(9));
        for (int i = 0; i < result.length; i++) {
            assertTrue(result[i] >= 1 && result[i] <= 2);
            if (i > 0) {
                assertNotEquals(result[i - 1], result[i]);
            }
        }
    }

    @Test
    void singleValueRangeWorksForOneElement() {
        assertArrayEquals(new int[] {4}, task.fill(1, 4, 4));
    }

    @Test
    void rejectsImpossibleRequests() {
        assertThrows(IllegalArgumentException.class, () -> task.fill(2, 4, 4));
        assertThrows(IllegalArgumentException.class, () -> task.fill(2, 5, 1));
    }
}
