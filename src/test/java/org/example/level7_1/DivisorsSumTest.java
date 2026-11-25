package org.example.level7_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisorsSumTest {

    private final DivisorsSum task = new DivisorsSum();

    @ParameterizedTest
    @CsvSource({"1, 1", "6, 12", "7, 8", "-12, 28"})
    void sumsDivisors(int number, int expected) {
        assertEquals(expected, task.sum(number));
    }

    @Test
    void rejectsZero() {
        assertThrows(IllegalArgumentException.class, () -> task.sum(0));
    }
}
