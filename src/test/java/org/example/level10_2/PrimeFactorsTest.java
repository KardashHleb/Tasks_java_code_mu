package org.example.level10_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

    private final PrimeFactors task = new PrimeFactors();

    @Test
    void factorsCompositeNumber() {
        assertEquals(List.of(2, 2, 3, 5), task.factor(60));
        assertEquals("2 * 2 * 3 * 5", task.format(60));
    }

    @Test
    void primesAndOne() {
        assertEquals(List.of(97), task.factor(97));
        assertEquals(List.of(2147483647), task.factor(Integer.MAX_VALUE));
        assertEquals(List.of(), task.factor(1));
        assertEquals("1", task.format(1));
    }

    @Test
    void rejectsNonPositiveNumbers() {
        assertThrows(IllegalArgumentException.class, () -> task.factor(0));
        assertThrows(IllegalArgumentException.class, () -> task.factor(-12));
    }
}
