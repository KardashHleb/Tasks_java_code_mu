package org.example.level1_10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivideUntilLessThanTenTest {

    private final DivideUntilLessThanTen counter = new DivideUntilLessThanTen();

    @ParameterizedTest
    @CsvSource({"1000, 7", "10, 1", "9.99, 0", "-50, 0", "20, 2"})
    void countsHalvings(double number, int expected) {
        assertEquals(expected, counter.countHalvings(number));
    }

    @Test
    void rejectsInfinity() {
        assertThrows(IllegalArgumentException.class, () -> counter.countHalvings(Double.POSITIVE_INFINITY));
    }
}
