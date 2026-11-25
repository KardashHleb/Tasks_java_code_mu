package org.example.level7_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PrimeCheckerTest {

    private final PrimeChecker task = new PrimeChecker();

    @ParameterizedTest
    @CsvSource({"2, true", "17, true", "2147483647, true", "1, false", "0, false", "-7, false", "49, false"})
    void detectsPrimes(int number, boolean expected) {
        assertEquals(expected, task.isPrime(number));
    }
}
