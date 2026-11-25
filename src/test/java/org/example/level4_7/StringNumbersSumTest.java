package org.example.level4_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringNumbersSumTest {

    private final StringNumbersSum task = new StringNumbersSum();

    @Test
    void sumsNumbers() {
        assertEquals(6, task.sum(new String[]{"1", "2", "3"}));
    }

    @Test
    void emptyArrayGivesZero() {
        assertEquals(0, task.sum(new String[0]));
    }

    @Test
    void nonNumberIsRejected() {
        assertThrows(IllegalArgumentException.class, () -> task.sum(new String[]{"1", "one"}));
    }
}
