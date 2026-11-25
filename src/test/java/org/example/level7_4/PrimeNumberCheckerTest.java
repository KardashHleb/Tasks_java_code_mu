package org.example.level7_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PrimeNumberCheckerTest {

    private final PrimeNumberChecker task = new PrimeNumberChecker();

    @ParameterizedTest
    @CsvSource({"2, true", "17, true", "2147483647, true", "1, false", "0, false", "-7, false", "49, false"})
    void detectsPrimes(int number, boolean expected) {
        assertEquals(expected, task.isPrime(number));
    }
}
