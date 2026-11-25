package org.example.level10_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DecimalPeriodTest {

    private final DecimalPeriod task = new DecimalPeriod();

    @ParameterizedTest
    @CsvSource({
            "1, 3, 3",
            "1, 7, 142857",
            "22, 7, 142857",
            "1, 6, 6",
            "1, 12, 3",
            "-5, 11, 45",
            "1, 4, ''",
            "6, 3, ''"
    })
    void findsPeriod(int numerator, int denominator, String expected) {
        assertEquals(expected, task.period(numerator, denominator));
    }

    @Test
    void rejectsZeroDenominator() {
        assertThrows(IllegalArgumentException.class, () -> task.period(1, 0));
    }
}
