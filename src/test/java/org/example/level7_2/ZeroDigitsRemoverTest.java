package org.example.level7_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ZeroDigitsRemoverTest {

    private final ZeroDigitsRemover task = new ZeroDigitsRemover();

    @ParameterizedTest
    @CsvSource({"10203, 123", "123, 123", "0, 0", "1000, 1", "-1050, -15"})
    void removesZeros(int number, int expected) {
        assertEquals(expected, task.remove(number));
    }
}
