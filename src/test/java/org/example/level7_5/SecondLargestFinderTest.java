package org.example.level7_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SecondLargestFinderTest {

    private final SecondLargestFinder task = new SecondLargestFinder();

    @Test
    void findsSecondLargest() {
        assertEquals(7, task.find(new int[] {3, 9, 7, 1}));
    }

    @Test
    void ignoresDuplicatesOfLargest() {
        assertEquals(5, task.find(new int[] {9, 5, 9, 2}));
        assertEquals(-3, task.find(new int[] {-3, -1}));
    }

    @Test
    void rejectsArraysWithoutSecondValue() {
        assertThrows(IllegalArgumentException.class, () -> task.find(new int[] {4, 4}));
        assertThrows(IllegalArgumentException.class, () -> task.find(new int[0]));
    }
}
