package org.example.level9_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PerfectNumberTest {

    private final PerfectNumber task = new PerfectNumber();

    @ParameterizedTest
    @CsvSource({
            "6, true",
            "28, true",
            "496, true",
            "8128, true",
            "12, false",
            "7, false",
            "1, false",
            "0, false",
            "-6, false"
    })
    void checksPerfectNumbers(int number, boolean expected) {
        assertEquals(expected, task.isPerfect(number));
    }
}
