package org.example.level2_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EvenElementsFilterTest {

    private final EvenElementsFilter filter = new EvenElementsFilter();

    @Test
    void keepsEvenElements() {
        assertArrayEquals(new int[] {2, -4, 0}, filter.evenElements(new int[] {1, 2, -4, 3, 0}));
    }

    @Test
    void noEvenElements() {
        assertArrayEquals(new int[0], filter.evenElements(new int[] {1, 3, -5}));
    }

    @Test
    void rejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> filter.evenElements(null));
    }
}
