package org.example.level5_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayDigitsReverserTest {

    private final ArrayDigitsReverser reverser = new ArrayDigitsReverser();

    @Test
    void reversesEachNumber() {
        assertArrayEquals(new long[]{321, 1, 0, -54}, reverser.reverseDigits(new int[]{123, 100, 0, -45}));
    }

    @Test
    void doesNotOverflow() {
        assertArrayEquals(new long[]{7463847412L}, reverser.reverseDigits(new int[]{2147483647}));
    }
}
