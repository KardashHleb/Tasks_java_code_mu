package org.example.level4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ZerosRemoverTest {

    private final ZerosRemover task = new ZerosRemover();

    @Test
    void removesZeros() {
        assertArrayEquals(new int[]{1, 2, -3}, task.removeZeros(new int[]{0, 1, 0, 2, -3, 0}));
    }

    @Test
    void onlyZeros() {
        assertArrayEquals(new int[0], task.removeZeros(new int[]{0, 0}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], task.removeZeros(new int[0]));
    }
}
