package org.example.level8_6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class XRowsArrayTest {

    @Test
    void buildsGrowingRows() {
        assertArrayEquals(new String[] {"x", "xx", "xxx", "xxxx", "xxxxx"}, new XRowsArray().make());
    }
}
