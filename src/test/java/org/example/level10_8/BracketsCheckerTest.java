package org.example.level10_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BracketsCheckerTest {

    private final BracketsChecker task = new BracketsChecker();

    @ParameterizedTest
    @CsvSource({
            "'(a + b) * (c - (d))', true",
            "'', true",
            "'no brackets', true",
            "'(()', false",
            "')(', false",
            "'())(()', false"
    })
    void checksBalance(String text, boolean expected) {
        assertEquals(expected, task.isBalanced(text));
    }
}
