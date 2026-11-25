package org.example.level8_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class LuckyTicketCheckerTest {

    private final LuckyTicketChecker task = new LuckyTicketChecker();

    @ParameterizedTest
    @CsvSource({"123321, true", "385916, true", "123456, false", "00, true", "1001, true"})
    void checksTickets(String number, boolean expected) {
        assertEquals(expected, task.isLucky(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "123", "12a321", "-12"})
    void rejectsInvalidNumbers(String number) {
        assertThrows(IllegalArgumentException.class, () -> task.isLucky(number));
    }
}
