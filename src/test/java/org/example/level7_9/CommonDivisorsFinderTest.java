package org.example.level7_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class CommonDivisorsFinderTest {

    private final CommonDivisorsFinder task = new CommonDivisorsFinder();

    @Test
    void findsCommonDivisors() {
        assertEquals(List.of(1, 2, 3, 6), task.find(new int[] {12, 18, -30}));
    }

    @Test
    void coprimeNumbersShareOnlyOne() {
        assertEquals(List.of(1), task.find(new int[] {8, 9}));
    }

    @Test
    void rejectsEmptyArrayAndZero() {
        assertThrows(IllegalArgumentException.class, () -> task.find(new int[0]));
        assertThrows(IllegalArgumentException.class, () -> task.find(new int[] {4, 0}));
    }
}
