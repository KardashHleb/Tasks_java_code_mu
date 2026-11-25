package org.example.level5_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuadraticSolverTest {

    private final QuadraticSolver solver = new QuadraticSolver();

    @Test
    void twoRoots() {
        assertArrayEquals(new double[]{3, 2}, solver.solve(1, -5, 6), 1e-9);
    }

    @Test
    void oneRootAndNoRoots() {
        assertArrayEquals(new double[]{-1}, solver.solve(1, 2, 1), 1e-9);
        assertArrayEquals(new double[0], solver.solve(1, 0, 1), 1e-9);
    }

    @Test
    void linearEquation() {
        assertArrayEquals(new double[]{2}, solver.solve(0, 3, -6), 1e-9);
    }

    @Test
    void rejectsDegenerateEquation() {
        assertThrows(IllegalArgumentException.class, () -> solver.solve(0, 0, 5));
    }
}
