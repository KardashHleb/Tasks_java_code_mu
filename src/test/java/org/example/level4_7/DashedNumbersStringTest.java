package org.example.level4_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DashedNumbersStringTest {

    @Test
    void makesDashedNumbers() {
        assertEquals("-1-2-3-4-5-", new DashedNumbersString().make());
    }
}
