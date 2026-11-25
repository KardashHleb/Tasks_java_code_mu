package org.example.level9_10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArrayToRowsTest {

    private final ArrayToRows task = new ArrayToRows();

    @Test
    void splitsWithShorterLastRow() {
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5}}, task.split(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    void splitsEvenly() {
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, task.split(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    void emptyArrayGivesNoRows() {
        assertEquals(0, task.split(new int[0], 4).length);
    }

    @Test
    void rejectsNonPositiveRowLength() {
        assertThrows(IllegalArgumentException.class, () -> task.split(new int[]{1}, 0));
    }
}
