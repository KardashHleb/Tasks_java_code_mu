package org.example.level6_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitGroupsSpacerTest {

    private final DigitGroupsSpacer spacer = new DigitGroupsSpacer();

    @ParameterizedTest
    @CsvSource({"1234567, 1 234 567", "123456, 123 456", "12, 12", "1000, 1 000", "7, 7"})
    void groupsDigits(String input, String expected) {
        assertEquals(expected, spacer.group(input));
    }

    @Test
    void rejectsNonDigits() {
        assertThrows(IllegalArgumentException.class, () -> spacer.group(""));
        assertThrows(IllegalArgumentException.class, () -> spacer.group("12a4"));
    }
}
