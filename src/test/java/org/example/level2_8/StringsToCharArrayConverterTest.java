package org.example.level2_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringsToCharArrayConverterTest {

    private final StringsToCharArrayConverter converter = new StringsToCharArrayConverter();

    @Test
    void flattensStrings() {
        assertArrayEquals(new char[] {'a', 'b', 'c', 'd', 'e'}, converter.toCharArray(new String[] {"ab", "", "cde"}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new char[0], converter.toCharArray(new String[0]));
    }

    @Test
    void rejectsNullElement() {
        assertThrows(IllegalArgumentException.class, () -> converter.toCharArray(new String[] {"a", null}));
    }
}
