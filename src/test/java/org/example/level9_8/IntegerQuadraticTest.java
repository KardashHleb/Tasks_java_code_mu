package org.example.level9_8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IntegerQuadraticTest {

    private final IntegerQuadratic task = new IntegerQuadratic();

    @ParameterizedTest
    @CsvSource({
            "2, 3, x^2 - 5x + 6 = 0",
            "1, 0, x^2 - x = 0",
            "0, 0, x^2 = 0",
            "-1, -1, x^2 + 2x + 1 = 0",
            "4, -4, x^2 - 16 = 0"
    })
    void formatsEquationFromRoots(int first, int second, String expected) {
        assertEquals(expected, task.format(first, second));
    }

    @Test
    void generatedEquationHasIntegerRootsInRange() {
        Random random = new Random(11);
        for (int i = 0; i < 50; i++) {
            IntegerQuadratic.Equation equation = task.generate(random);
            assertTrue(Math.abs(equation.firstRoot()) <= 5 && Math.abs(equation.secondRoot()) <= 5);
            assertEquals(task.format(equation.firstRoot(), equation.secondRoot()), equation.text());
        }
    }
}
