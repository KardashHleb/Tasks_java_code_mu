package org.example.level1_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumFromOneToHundredTest {

    @Test
    void sumOfOneToHundred() {
        assertEquals(5050, new SumFromOneToHundred().calculateSum());
    }
}
