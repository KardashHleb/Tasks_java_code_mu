package org.example.level3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastZeroInStringTest {

    private final LastZeroInString task = new LastZeroInString();

    @Test
    void findsLastZero() {
        assertEquals(3, task.findLastZero("10203"));
    }

    @Test
    void noZeroGivesMinusOne() {
        assertEquals(-1, task.findLastZero("123"));
    }

    @Test
    void emptyString() {
        assertEquals(-1, task.findLastZero(""));
    }
}
