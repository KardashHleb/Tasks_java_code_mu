package org.example.level2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringArrayToIntConverterTest {

    private final StringArrayToIntConverter converter = new StringArrayToIntConverter();

    @Test
    void convertsNumbers() {
        assertArrayEquals(new int[] {1, -20, 300}, converter.toIntArray(new String[] {"1", "-20", " 300 "}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new int[0], converter.toIntArray(new String[0]));
    }

    @Test
    void rejectsNonNumber() {
        assertThrows(IllegalArgumentException.class, () -> converter.toIntArray(new String[] {"1", "x"}));
    }
}
