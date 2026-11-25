package org.example.level2_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageFromOneToHundredTest {

    @Test
    void averageOfOneToHundred() {
        assertEquals(50.5, new AverageFromOneToHundred().calculateAverage());
    }
}
