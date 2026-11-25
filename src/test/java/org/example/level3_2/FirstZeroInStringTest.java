package org.example.level3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstZeroInStringTest {

    private final FirstZeroInString task = new FirstZeroInString();

    @Test
    void findsFirstZero() {
        assertEquals(2, task.findFirstZero("120304"));
    }

    @Test
    void noZeroGivesMinusOne() {
        assertEquals(-1, task.findFirstZero("12345"));
    }

    @Test
    void emptyString() {
        assertEquals(-1, task.findFirstZero(""));
    }
}
