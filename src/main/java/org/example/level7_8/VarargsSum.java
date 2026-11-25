package org.example.level7_8;

public class VarargsSum {

    /** Returns the sum of any number of integer arguments (0 when called without arguments). */
    public int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
