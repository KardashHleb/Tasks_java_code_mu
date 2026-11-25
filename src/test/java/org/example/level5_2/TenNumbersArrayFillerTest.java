package org.example.level5_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TenNumbersArrayFillerTest {

    private final TenNumbersArrayFiller filler = new TenNumbersArrayFiller();

    @Test
    void copiesTenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = filler.fill(input);
        assertArrayEquals(input, result);
        assertNotSame(input, result);
    }

    @Test
    void rejectsWrongCount() {
        assertThrows(IllegalArgumentException.class, () -> filler.fill(1, 2, 3));
    }
}
