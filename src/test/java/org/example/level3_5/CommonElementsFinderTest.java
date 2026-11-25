package org.example.level3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CommonElementsFinderTest {

    private final CommonElementsFinder finder = new CommonElementsFinder();

    @Test
    void findsCommonElements() {
        assertArrayEquals(new int[]{2, 4}, finder.findCommon(new int[]{1, 2, 3, 4}, new int[]{4, 2, 6}));
    }

    @Test
    void nothingInCommon() {
        assertArrayEquals(new int[0], finder.findCommon(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    void emptySecondArray() {
        assertArrayEquals(new int[0], finder.findCommon(new int[]{1, 2}, new int[0]));
    }
}
