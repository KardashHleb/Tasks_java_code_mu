package org.example.level4_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ZerosFilterTest {

    private final ZerosFilter filter = new ZerosFilter();

    @Test
    void removesZeros() {
        assertArrayEquals(new int[]{5, -1}, filter.removeZeros(new int[]{0, 5, 0, -1}));
    }

    @Test
    void noZeros() {
        assertArrayEquals(new int[]{1, 2}, filter.removeZeros(new int[]{1, 2}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], filter.removeZeros(new int[0]));
    }
}
