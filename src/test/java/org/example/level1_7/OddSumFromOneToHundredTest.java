package org.example.level1_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddSumFromOneToHundredTest {

    @Test
    void sumOfOddNumbers() {
        assertEquals(2500, new OddSumFromOneToHundred().calculateOddSum());
    }
}
