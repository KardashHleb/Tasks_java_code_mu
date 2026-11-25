package org.example.level2_10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LuckyTicketCheckerTest {

    private final LuckyTicketChecker checker = new LuckyTicketChecker();

    @ParameterizedTest
    @CsvSource({"123321, true", "385916, true", "123456, false", "100000, false", "999999, true"})
    void checksHalves(int number, boolean expected) {
        assertEquals(expected, checker.isLucky(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {99_999, 1_000_000, -123321, 0})
    void rejectsNonSixDigitNumbers(int number) {
        assertThrows(IllegalArgumentException.class, () -> checker.isLucky(number));
    }
}
