package org.example.level2_2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class DigitsFromEndCollectorTest {

    private final DigitsFromEndCollector collector = new DigitsFromEndCollector();

    @Test
    void digitsInReverseOrder() {
        assertIterableEquals(List.of(4, 3, 2, 1), collector.digitsFromEnd(1234));
    }

    @Test
    void zero() {
        assertIterableEquals(List.of(0), collector.digitsFromEnd(0));
    }

    @Test
    void negativeNumber() {
        assertIterableEquals(List.of(0, 5), collector.digitsFromEnd(-50));
    }
}
