package org.example.level6_8;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FridayThirteenthsTest {

    private final FridayThirteenths finder = new FridayThirteenths();

    @Test
    void findsFridaysOf2026() {
        assertEquals(List.of(LocalDate.of(2026, 2, 13), LocalDate.of(2026, 3, 13), LocalDate.of(2026, 11, 13)),
                finder.find(2026));
    }

    @Test
    void yearWithSingleFriday() {
        assertEquals(List.of(LocalDate.of(2022, 5, 13)), finder.find(2022));
    }
}
