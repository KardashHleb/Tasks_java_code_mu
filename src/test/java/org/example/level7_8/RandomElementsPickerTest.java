package org.example.level7_8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

class RandomElementsPickerTest {

    private final RandomElementsPicker task = new RandomElementsPicker();

    @Test
    void picksDistinctPositions() {
        int[] result = task.pick(new int[] {10, 20, 30, 40, 50}, 3, new Random(4));
        assertEquals(3, result.length);
        assertEquals(3, Arrays.stream(result).distinct().count());
    }

    @Test
    void pickingAllReturnsPermutation() {
        int[] result = task.pick(new int[] {1, 2, 3, 4}, 4, new Random(8));
        Arrays.sort(result);
        assertArrayEquals(new int[] {1, 2, 3, 4}, result);
    }

    @Test
    void rejectsInvalidCount() {
        assertThrows(IllegalArgumentException.class, () -> task.pick(new int[] {1, 2}, 3));
        assertThrows(IllegalArgumentException.class, () -> task.pick(new int[] {1, 2}, -1));
    }
}
