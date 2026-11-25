package org.example.level7_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisorsCounterTest {

    private final DivisorsCounter task = new DivisorsCounter();

    @ParameterizedTest
    @CsvSource({"1, 1", "12, 6", "13, 2", "-36, 9"})
    void countsDivisors(int number, int expected) {
        assertEquals(expected, task.count(number));
    }

    @Test
    void rejectsZero() {
        assertThrows(IllegalArgumentException.class, () -> task.count(0));
    }
}
