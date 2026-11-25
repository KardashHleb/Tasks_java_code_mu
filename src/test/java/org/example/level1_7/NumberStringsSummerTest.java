package org.example.level1_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumberStringsSummerTest {

    private final NumberStringsSummer summer = new NumberStringsSummer();

    @Test
    void sumsNumbers() {
        assertEquals(60, summer.sumNumberStrings("10", "20", "30"));
    }

    @Test
    void handlesNegativeAndSpaces() {
        assertEquals(-5, summer.sumNumberStrings(" -10", "0", "5 "));
    }

    @Test
    void rejectsNonNumber() {
        assertThrows(IllegalArgumentException.class, () -> summer.sumNumberStrings("1", "two", "3"));
    }
}
