package org.example.level5_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FirstDigitsCollectorTest {

    private final FirstDigitsCollector collector = new FirstDigitsCollector();

    @Test
    void collectsFirstDigits() {
        assertArrayEquals(new byte[]{1, 9, 0, 4}, collector.collect(new int[]{123, 9, 0, -456}));
    }

    @Test
    void emptyArray() {
        assertArrayEquals(new byte[0], collector.collect(new int[0]));
    }
}
