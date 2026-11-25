package org.example.level8_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DashedPairsStringTest {

    @Test
    void buildsDashedPairs() {
        assertEquals("-1-12-23-34-45-", new DashedPairsString().make());
    }
}
