package org.example.level5_2;

import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondWithDigitThreeTest {

    private final SecondWithDigitThree finder = new SecondWithDigitThree();

    @Test
    void findsSecondNumberWithThree() {
        assertEquals(OptionalInt.of(-23), finder.find(new int[]{13, 5, -23, 33}));
    }

    @Test
    void emptyWhenFewerThanTwoMatches() {
        assertEquals(OptionalInt.empty(), finder.find(new int[]{3, 0, 45}));
    }
}
