package org.example.level2_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstAndLastSwapperTest {

    private final FirstAndLastSwapper swapper = new FirstAndLastSwapper();

    @Test
    void swapsEnds() {
        int[] input = {1, 2, 3, 4};
        assertArrayEquals(new int[] {4, 2, 3, 1}, swapper.swap(input));
        assertArrayEquals(new int[] {1, 2, 3, 4}, input);
    }

    @Test
    void singleElement() {
        assertArrayEquals(new int[] {7}, swapper.swap(new int[] {7}));
    }

    @Test
    void rejectsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> swapper.swap(new int[0]));
    }
}
