package org.example.level7_7;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

class NonRepeatingRandomTest {

    @Test
    void consecutiveValuesDifferAndStayInRange() {
        NonRepeatingRandom generator = new NonRepeatingRandom(new Random(42));
        int previous = generator.next();
        for (int i = 0; i < 500; i++) {
            int current = generator.next();
            assertTrue(current >= 1 && current <= 10);
            assertNotEquals(previous, current);
            previous = current;
        }
    }
}
