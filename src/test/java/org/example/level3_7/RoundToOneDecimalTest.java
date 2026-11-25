package org.example.level3_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RoundToOneDecimalTest {

    private final RoundToOneDecimal task = new RoundToOneDecimal();

    @Test
    void roundsToTenths() {
        assertArrayEquals(new double[]{1.2, 3.5, -2.7}, task.round(new float[]{1.23f, 3.46f, -2.71f}), 1e-9);
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new double[0], task.round(new float[0]), 1e-9);
    }
}
