package org.example.level7_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class PrimesInRangeTest {

    private final PrimesInRange task = new PrimesInRange();

    @Test
    void findsPrimesInRange() {
        assertEquals(List.of(11, 13, 17, 19), task.primes(10, 20));
    }

    @Test
    void acceptsReversedBoundsAndNegativeNumbers() {
        assertEquals(List.of(2, 3, 5, 7), task.primes(10, -5));
    }

    @Test
    void returnsEmptyListWhenNoPrimes() {
        assertEquals(List.of(), task.primes(24, 28));
    }
}
