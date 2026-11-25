package org.example.level10_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FractionReductionTest {

    private final FractionReduction task = new FractionReduction();

    @ParameterizedTest
    @CsvSource({
            "12/18, 12/18 = 6/9 = 2/3",
            "2/3, 2/3",
            "8/4, 8/4 = 4/2 = 2/1",
            "-6/9, -6/9 = -2/3",
            "0/5, 0/5 = 0/1"
    })
    void reducesStepByStep(String fraction, String expected) {
        assertEquals(expected, task.reduce(fraction));
    }

    @Test
    void rejectsZeroDenominator() {
        assertThrows(IllegalArgumentException.class, () -> task.reduce("1/0"));
    }

    @Test
    void rejectsMalformedFraction() {
        assertThrows(IllegalArgumentException.class, () -> task.reduce("half"));
    }
}
