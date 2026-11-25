package org.example.level5_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CubeElementsSumTest {

    private final CubeElementsSum summer = new CubeElementsSum();

    @Test
    void sumsAllElements() {
        int[][][] cube = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        assertEquals(36, summer.sum(cube));
    }

    @Test
    void emptyCubeSumsToZero() {
        assertEquals(0, summer.sum(new int[0][][]));
    }
}
