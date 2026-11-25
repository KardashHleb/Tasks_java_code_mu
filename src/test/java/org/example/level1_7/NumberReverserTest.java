package org.example.level1_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberReverserTest {

    private final NumberReverser reverser = new NumberReverser();

    @ParameterizedTest
    @CsvSource({"12345, 54321", "0, 0", "-123, -321", "1200, 21", "2147483647, 7463847412"})
    void reversesDigits(int number, long expected) {
        assertEquals(expected, reverser.reverse(number));
    }
}
