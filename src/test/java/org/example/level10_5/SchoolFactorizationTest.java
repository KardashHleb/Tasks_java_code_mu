package org.example.level10_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

class SchoolFactorizationTest {

    private final SchoolFactorization task = new SchoolFactorization();

    @Test
    void writesColumnSteps() {
        SchoolFactorization.Solution solution = task.solve(60);
        assertEquals(List.of(2, 2, 3, 5), solution.factors());
        assertEquals(List.of("60 | 2", "30 | 2", "15 | 3", "5 | 5", "1 |", "60 = 2 * 2 * 3 * 5"), solution.steps());
    }

    @Test
    void factorsPrimesQuickly() {
        assertEquals(List.of("13 | 13", "1 |", "13 = 13"), task.solve(13).steps());
        assertEquals(List.of(Integer.MAX_VALUE), task.factor(Integer.MAX_VALUE));
    }

    @Test
    void rejectsNumbersBelowTwo() {
        assertThrows(IllegalArgumentException.class, () -> task.factor(1));
        assertThrows(IllegalArgumentException.class, () -> task.factor(-10));
    }
}
