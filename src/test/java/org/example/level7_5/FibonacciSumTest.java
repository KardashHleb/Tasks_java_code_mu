package org.example.level7_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciSumTest {

    private final FibonacciSum task = new FibonacciSum();

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "2, 2", "5, 12", "10, 143"})
    void sumsFirstNumbers(int count, long expected) {
        assertEquals(expected, task.sumFirst(count));
    }

    @Test
    void rejectsNegativeCount() {
        assertThrows(IllegalArgumentException.class, () -> task.sumFirst(-1));
    }
}
