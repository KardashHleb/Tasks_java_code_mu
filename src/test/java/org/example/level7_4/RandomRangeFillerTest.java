package org.example.level7_4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

class RandomRangeFillerTest {

    private final RandomRangeFiller task = new RandomRangeFiller();

    @Test
    void valuesStayInRange() {
        int[] result = task.fill(200, -3, 3, new Random(1));
        assertEquals(200, result.length);
        for (int value : result) {
            assertTrue(value >= -3 && value <= 3);
        }
    }

    @Test
    void sameSeedGivesSameResult() {
        assertArrayEquals(task.fill(10, 1, 100, new Random(7)), task.fill(10, 1, 100, new Random(7)));
    }

    @Test
    void rejectsInvalidArguments() {
        assertThrows(IllegalArgumentException.class, () -> task.fill(-1, 1, 5));
        assertThrows(IllegalArgumentException.class, () -> task.fill(3, 5, 1));
    }
}
