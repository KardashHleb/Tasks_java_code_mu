package org.example.level10_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SameLettersCheckerTest {

    private final SameLettersChecker task = new SameLettersChecker();

    @ParameterizedTest
    @CsvSource({
            "listen, silent, true",
            "aab, aba, true",
            "'', '', true",
            "aab, abb, false",
            "abc, abcd, false",
            "Tea, eat, false"
    })
    void comparesLetters(String first, String second, boolean expected) {
        assertEquals(expected, task.haveSameLetters(first, second));
    }
}
