package org.example.level8_1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TripleBlocksArrayTest {

    @Test
    void everyRowIsOneTwoThree() {
        int[][][] result = new TripleBlocksArray().make();
        assertEquals(3, result.length);
        for (int[][] block : result) {
            assertEquals(3, block.length);
            for (int[] row : block) {
                assertArrayEquals(new int[] {1, 2, 3}, row);
            }
        }
    }
}
