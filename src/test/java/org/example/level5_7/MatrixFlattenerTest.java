package org.example.level5_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixFlattenerTest {

    private final MatrixFlattener flattener = new MatrixFlattener();

    @Test
    void flattensJaggedMatrix() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, flattener.flatten(new int[][]{{1, 2}, {3}, {4, 5, 6}}));
    }

    @Test
    void emptyMatrix() {
        assertArrayEquals(new int[0], flattener.flatten(new int[][]{{}, {}}));
    }
}
