package org.example.level10_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class RangePrimesTest {

    private final RangePrimes task = new RangePrimes();

    @Test
    void findsPrimesInRange() {
        assertEquals(List.of(11, 13, 17, 19, 23, 29), task.primes(10, 30));
    }

    @Test
    void edgeRanges() {
        assertEquals(List.of(2), task.primes(2, 2));
        assertEquals(List.of(), task.primes(-10, 1));
        assertEquals(List.of(), task.primes(24, 28));
    }

    @Test
    void rejectsReversedRange() {
        assertThrows(IllegalArgumentException.class, () -> task.primes(30, 10));
    }
}
