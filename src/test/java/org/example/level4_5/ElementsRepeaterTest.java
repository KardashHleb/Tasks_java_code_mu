package org.example.level4_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ElementsRepeaterTest {

    private final ElementsRepeater task = new ElementsRepeater();

    @Test
    void repeatsEachElement() {
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, task.repeatTwice(new int[]{1, 2, 3}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], task.repeatTwice(new int[0]));
    }
}
