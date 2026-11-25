package org.example.level7_10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

class ArrayShufflerTest {

    private final ArrayShuffler task = new ArrayShuffler();

    @Test
    void keepsSameElementsAndOriginalArray() {
        int[] original = {5, 1, 4, 2, 3, 3};
        int[] result = task.shuffle(original, new Random(10));
        assertArrayEquals(new int[] {5, 1, 4, 2, 3, 3}, original);
        int[] sorted = Arrays.copyOf(result, result.length);
        Arrays.sort(sorted);
        assertArrayEquals(new int[] {1, 2, 3, 3, 4, 5}, sorted);
    }

    @Test
    void sameSeedGivesSameOrder() {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(task.shuffle(values, new Random(1)), task.shuffle(values, new Random(1)));
    }

    @Test
    void handlesEmptyArray() {
        assertArrayEquals(new int[0], task.shuffle(new int[0]));
    }
}
