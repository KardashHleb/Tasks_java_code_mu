package org.example.level4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SkipFirstElementsTest {

    private final SkipFirstElements task = new SkipFirstElements();

    @Test
    void skipsElements() {
        assertArrayEquals(new int[]{3, 4, 5}, task.skip(new int[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    void skipNoneAndAll() {
        assertArrayEquals(new int[]{1, 2}, task.skip(new int[]{1, 2}, 0));
        assertArrayEquals(new int[0], task.skip(new int[]{1, 2}, 2));
    }

    @Test
    void outOfRangeCountIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.skip(new int[]{1, 2}, 3));
        assertThrows(IllegalArgumentException.class, () -> task.skip(new int[]{1, 2}, -1));
    }
}
