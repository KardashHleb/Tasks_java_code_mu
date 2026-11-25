package org.example.level3_3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeCheckerTest {

    private final PalindromeChecker checker = new PalindromeChecker();

    @ParameterizedTest
    @CsvSource({"level, true", "noon, true", "hello, false", "a, true", "'', true", "Anna, false"})
    void checksPalindromes(String word, boolean expected) {
        assertEquals(expected, checker.isPalindrome(word));
    }
}
