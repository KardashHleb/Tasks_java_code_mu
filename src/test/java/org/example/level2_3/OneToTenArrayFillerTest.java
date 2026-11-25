package org.example.level2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OneToTenArrayFillerTest {

    @Test
    void fillsOneToTen() {
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new OneToTenArrayFiller().fill());
    }
}
