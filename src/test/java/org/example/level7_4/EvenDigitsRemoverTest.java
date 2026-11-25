package org.example.level7_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class EvenDigitsRemoverTest {

    private final EvenDigitsRemover task = new EvenDigitsRemover();

    @ParameterizedTest
    @CsvSource({"123456, 135", "2468, 0", "0, 0", "-9081, -91", "13579, 13579"})
    void removesEvenDigits(int number, int expected) {
        assertEquals(expected, task.remove(number));
    }
}
