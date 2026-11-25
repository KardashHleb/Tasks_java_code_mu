package org.example.level5_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class XMatrixBuilderTest {

    @Test
    void buildsThreeByThreeOfX() {
        char[] row = {'x', 'x', 'x'};
        assertArrayEquals(new char[][]{row, row, row}, new XMatrixBuilder().build());
    }
}
