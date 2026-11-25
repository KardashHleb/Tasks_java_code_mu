package org.example.level7_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class StringCutterTest {

    private final StringCutter task = new StringCutter();

    @Test
    void cutsToLength() {
        assertEquals("hel", task.cut("hello", 3));
    }

    @Test
    void handlesLengthOutsideText() {
        assertEquals("hello", task.cut("hello", 10));
        assertEquals("", task.cut("hello", 0));
    }

    @Test
    void rejectsNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> task.cut("hello", -1));
    }
}
