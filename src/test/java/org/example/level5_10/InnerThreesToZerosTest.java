package org.example.level5_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InnerThreesToZerosTest {

    private final InnerThreesToZeros replacer = new InnerThreesToZeros();

    @Test
    void keepsLeadingThree() {
        assertArrayEquals(new int[]{3000, 1020, 3}, replacer.replace(new int[]{3333, 1323, 3}));
    }

    @Test
    void handlesNegativesAndNumbersWithoutThree() {
        assertArrayEquals(new int[]{-300, 0, 125}, replacer.replace(new int[]{-333, 0, 125}));
    }
}
