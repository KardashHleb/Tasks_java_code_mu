package org.example.level2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TenToOneArrayFillerTest {

    @Test
    void fillsTenToOne() {
        assertArrayEquals(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, new TenToOneArrayFiller().fill());
    }
}
