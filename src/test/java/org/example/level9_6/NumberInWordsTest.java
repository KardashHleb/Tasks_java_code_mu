package org.example.level9_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberInWordsTest {

    private final NumberInWords task = new NumberInWords();

    @ParameterizedTest
    @CsvSource({
            "0, zero",
            "7, seven",
            "15, fifteen",
            "40, forty",
            "42, forty-two",
            "100, one hundred",
            "105, one hundred five",
            "999, nine hundred ninety-nine",
            "-42, minus forty-two"
    })
    void writesNumberInWords(int number, String expected) {
        assertEquals(expected, task.words(number));
    }

    @Test
    void rejectsNumbersOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> task.words(1000));
        assertThrows(IllegalArgumentException.class, () -> task.words(-1000));
    }
}
