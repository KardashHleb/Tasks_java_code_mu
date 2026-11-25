package org.example.level10_10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class ArrayPermutationsTest {

    private final ArrayPermutations task = new ArrayPermutations();

    @Test
    void generatesAllPermutationsInSwapOrder() {
        int[][] expected = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 2, 1}, {3, 1, 2}};
        assertArrayEquals(expected, task.permute(new int[]{1, 2, 3}).toArray(int[][]::new));
    }

    @Test
    void countIsFactorialAndInputIsUnchanged() {
        int[] values = {4, 3, 2, 1, 0};
        List<int[]> permutations = task.permute(values);
        assertEquals(120, permutations.size());
        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, values);
    }

    @Test
    void emptyArrayHasOnePermutation() {
        assertEquals(1, task.permute(new int[0]).size());
    }

    @Test
    void rejectsTooLongArray() {
        assertThrows(IllegalArgumentException.class, () -> task.permute(new int[9]));
    }
}
