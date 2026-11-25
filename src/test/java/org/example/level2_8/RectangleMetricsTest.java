package org.example.level2_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleMetricsTest {

    private final RectangleMetrics metrics = new RectangleMetrics();

    @Test
    void areaAndPerimeter() {
        assertEquals(12, metrics.area(3, 4));
        assertEquals(14, metrics.perimeter(3, 4));
    }

    @Test
    void degenerateRectangle() {
        assertEquals(0, metrics.area(0, 5));
        assertEquals(10, metrics.perimeter(0, 5));
    }

    @Test
    void rejectsNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> metrics.area(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> metrics.perimeter(1, -5));
    }
}
