package org.example.level2_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayAverageTest {

    private final ArrayAverage average = new ArrayAverage();

    @Test
    void averageOfElements() {
        assertEquals(2.5, average.calculateAverage(new int[] {1, 2, 3, 4}));
    }

    @Test
    void singleElement() {
        assertEquals(-7.0, average.calculateAverage(new int[] {-7}));
    }

    @Test
    void rejectsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> average.calculateAverage(new int[0]));
    }
}
