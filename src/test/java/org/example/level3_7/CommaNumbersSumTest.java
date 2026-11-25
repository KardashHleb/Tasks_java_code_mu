package org.example.level3_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CommaNumbersSumTest {

    private final CommaNumbersSum task = new CommaNumbersSum();

    @Test
    void sumsNumbers() {
        assertEquals(15, task.sum("1,2,3,4,5"));
    }

    @Test
    void negativesAndSpaces() {
        assertEquals(-2, task.sum("10, -12"));
    }

    @Test
    void emptyStringGivesZero() {
        assertEquals(0, task.sum(""));
    }

    @Test
    void nonNumberIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.sum("1,x,3"));
    }
}
