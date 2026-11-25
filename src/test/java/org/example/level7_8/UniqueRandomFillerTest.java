package org.example.level7_8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

class UniqueRandomFillerTest {

    private final UniqueRandomFiller task = new UniqueRandomFiller();

    @Test
    void valuesAreDistinct() {
        int[] result = task.fill(8, 1, 10, new Random(6));
        assertEquals(8, Arrays.stream(result).distinct().count());
        assertTrue(Arrays.stream(result).allMatch(value -> value >= 1 && value <= 10));
    }

    @Test
    void fillingWholeRangeGivesPermutation() {
        int[] result = task.fill(5, -2, 2, new Random(3));
        Arrays.sort(result);
        assertArrayEquals(new int[] {-2, -1, 0, 1, 2}, result);
    }

    @Test
    void rejectsCountLargerThanRange() {
        assertThrows(IllegalArgumentException.class, () -> task.fill(6, 1, 5));
        assertThrows(IllegalArgumentException.class, () -> task.fill(-1, 1, 5));
    }
}
