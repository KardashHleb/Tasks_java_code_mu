package org.example.level6_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlternatingSignsStringTest {

    @Test
    void buildsAlternatingSigns() {
        assertEquals("1+2-3+4-5+6-7+8", new AlternatingSignsString().build());
    }
}
