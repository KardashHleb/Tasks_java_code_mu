package org.example.level2_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SphereMetricsTest {

    private final SphereMetrics metrics = new SphereMetrics();

    @Test
    void unitSphere() {
        assertEquals(4.18879, metrics.volume(1), 1e-5);
        assertEquals(12.56637, metrics.surfaceArea(1), 1e-5);
    }

    @Test
    void zeroRadius() {
        assertEquals(0.0, metrics.volume(0));
        assertEquals(0.0, metrics.surfaceArea(0));
    }

    @Test
    void rejectsNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> metrics.volume(-1));
        assertThrows(IllegalArgumentException.class, () -> metrics.surfaceArea(-1));
    }
}
