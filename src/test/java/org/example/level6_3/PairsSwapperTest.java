package org.example.level6_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PairsSwapperTest {

    private final PairsSwapper swapper = new PairsSwapper();

    @Test
    void swapsPairs() {
        assertArrayEquals(new int[]{2, 1, 4, 3}, swapper.swap(new int[]{1, 2, 3, 4}));
    }

    @Test
    void oddLengthKeepsLastElement() {
        assertArrayEquals(new int[]{2, 1, 5}, swapper.swap(new int[]{1, 2, 5}));
    }

    @Test
    void doesNotModifyInput() {
        int[] input = {1, 2};
        swapper.swap(input);
        assertArrayEquals(new int[]{1, 2}, input);
    }
}
