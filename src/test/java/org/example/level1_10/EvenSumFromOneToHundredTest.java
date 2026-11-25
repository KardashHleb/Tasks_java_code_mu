package org.example.level1_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenSumFromOneToHundredTest {

    @Test
    void sumOfEvenNumbers() {
        assertEquals(2550, new EvenSumFromOneToHundred().calculateEvenSum());
    }
}
