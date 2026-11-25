package org.example.level4_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenDigitsCountTest {

    private final EvenDigitsCount task = new EvenDigitsCount();

    @ParameterizedTest
    @CsvSource({"12345, 2", "2468, 4", "1357, 0", "0, 1", "-204, 3"})
    void countsEvenDigits(int number, int expected) {
        assertEquals(expected, task.countEvenDigits(number));
    }
}
