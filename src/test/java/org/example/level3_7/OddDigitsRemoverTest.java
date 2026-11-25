package org.example.level3_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddDigitsRemoverTest {

    private final OddDigitsRemover task = new OddDigitsRemover();

    @ParameterizedTest
    @CsvSource({"123456, 246", "13579, 0", "2048, 2048", "0, 0", "-1234, -24"})
    void removesOddDigits(int number, int expected) {
        assertEquals(expected, task.removeOddDigits(number));
    }
}
