package org.example.level10_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SchoolGcdTest {

    private final SchoolGcd task = new SchoolGcd();

    @Test
    void writesEuclidSteps() {
        SchoolGcd.Solution solution = task.solve(48, 18);
        assertEquals(6, solution.gcd());
        assertEquals(List.of("48 = 18 * 2 + 12", "18 = 12 * 1 + 6", "12 = 6 * 2 + 0", "GCD = 6"), solution.steps());
    }

    @ParameterizedTest
    @CsvSource({
            "-48, 18, 6",
            "17, 5, 1",
            "0, 5, 5",
            "7, 7, 7"
    })
    void computesGcd(int first, int second, long expected) {
        assertEquals(expected, task.gcd(first, second));
    }

    @Test
    void rejectsTwoZeros() {
        assertThrows(IllegalArgumentException.class, () -> task.gcd(0, 0));
    }
}
