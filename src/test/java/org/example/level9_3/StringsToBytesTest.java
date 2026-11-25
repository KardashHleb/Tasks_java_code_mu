package org.example.level9_3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class StringsToBytesTest {

    private final StringsToBytes task = new StringsToBytes();

    @Test
    void convertsDigitStrings() {
        assertArrayEquals(new byte[][]{{1, 2, 3}, {0, 9}, {}}, task.convert(new String[]{"123", "09", ""}));
    }

    @Test
    void rejectsNonDigits() {
        assertThrows(IllegalArgumentException.class, () -> task.convert(new String[]{"12a"}));
    }
}
