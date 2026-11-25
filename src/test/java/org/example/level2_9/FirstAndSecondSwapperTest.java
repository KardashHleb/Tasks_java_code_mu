package org.example.level2_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FirstAndSecondSwapperTest {

    private final FirstAndSecondSwapper swapper = new FirstAndSecondSwapper();

    @Test
    void swapsFirstTwo() {
        int[] input = {1, 2, 3};
        assertArrayEquals(new int[] {2, 1, 3}, swapper.swap(input));
        assertArrayEquals(new int[] {1, 2, 3}, input);
    }

    @Test
    void twoElements() {
        assertArrayEquals(new int[] {9, 8}, swapper.swap(new int[] {8, 9}));
    }

    @Test
    void rejectsSingleElement() {
        assertThrows(IllegalArgumentException.class, () -> swapper.swap(new int[] {1}));
    }
}
