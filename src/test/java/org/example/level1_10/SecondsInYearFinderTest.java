package org.example.level1_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondsInYearFinderTest {

    @Test
    void secondsInYear() {
        assertEquals(31_536_000, new SecondsInYearFinder().countSeconds());
    }
}
