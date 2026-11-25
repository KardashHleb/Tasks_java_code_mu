package org.example.level7_9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;

class RandomColorTest {

    private final RandomColor task = new RandomColor();

    @Test
    void producesHexColor() {
        Random random = new Random(12);
        for (int i = 0; i < 20; i++) {
            assertTrue(task.color(random).matches("#[0-9a-f]{6}"));
        }
    }

    @Test
    void sameSeedGivesSameColor() {
        assertEquals(task.color(new Random(3)), task.color(new Random(3)));
    }
}
