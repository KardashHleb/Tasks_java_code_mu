package org.example.level2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayReverserTest {

    private final ArrayReverser reverser = new ArrayReverser();

    @Test
    void reversesElements() {
        int[] input = {1, 2, 3, 4};
        assertArrayEquals(new int[] {4, 3, 2, 1}, reverser.reverse(input));
        assertArrayEquals(new int[] {1, 2, 3, 4}, input);
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], reverser.reverse(new int[0]));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> reverser.reverse(null));
    }
}
