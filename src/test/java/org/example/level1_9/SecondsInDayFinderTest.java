package org.example.level1_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondsInDayFinderTest {

    @Test
    void secondsInDay() {
        assertEquals(86_400, new SecondsInDayFinder().countSeconds());
    }
}
