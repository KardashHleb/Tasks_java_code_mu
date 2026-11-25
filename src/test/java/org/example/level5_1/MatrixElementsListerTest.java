package org.example.level5_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixElementsListerTest {

    private final MatrixElementsLister lister = new MatrixElementsLister();

    @Test
    void listsElementsRowByRow() {
        assertEquals("1\n2\n3\n4\n5", lister.toLines(new int[][]{{1, 2}, {3, 4, 5}}));
    }

    @Test
    void emptyMatrixGivesEmptyString() {
        assertEquals("", lister.toLines(new int[0][0]));
    }
}
