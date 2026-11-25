package org.example.level10_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class EratosthenesTest {

    private final Eratosthenes task = new Eratosthenes();

    @Test
    void sievesPrimesUpToThirty() {
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), task.primes(1, 30));
    }

    @Test
    void edgeRanges() {
        assertEquals(List.of(), task.primes(14, 16));
        assertEquals(List.of(), task.primes(-5, 1));
        assertEquals(List.of(97), task.primes(97, 97));
        assertEquals(78498, task.primes(0, 1_000_000).size());
    }

    @Test
    void rejectsReversedRange() {
        assertThrows(IllegalArgumentException.class, () -> task.primes(10, 1));
    }
}
