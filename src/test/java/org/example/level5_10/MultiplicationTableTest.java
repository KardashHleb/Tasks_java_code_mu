package org.example.level5_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTableTest {

    private final MultiplicationTable table = new MultiplicationTable();

    @Test
    void buildsTableForSeven() {
        String expected = "1 * 7 = 7\n2 * 7 = 14\n3 * 7 = 21\n4 * 7 = 28\n5 * 7 = 35\n"
                + "6 * 7 = 42\n7 * 7 = 49\n8 * 7 = 56\n9 * 7 = 63";
        assertEquals(expected, table.build(7));
    }

    @Test
    void handlesNegativeNumber() {
        assertEquals("9 * -2 = -18", table.build(-2).lines().reduce((a, b) -> b).orElseThrow());
    }
}
