package org.example.level2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayElementsDoublerTest {

    private final ArrayElementsDoubler doubler = new ArrayElementsDoubler();

    @Test
    void doublesElements() {
        int[] input = {1, -2, 0};
        assertArrayEquals(new int[] {2, -4, 0}, doubler.doubleElements(input));
        assertArrayEquals(new int[] {1, -2, 0}, input);
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], doubler.doubleElements(new int[0]));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> doubler.doubleElements(null));
    }
}
