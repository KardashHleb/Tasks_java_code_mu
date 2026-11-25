package org.example.level9_2;

public class DashedXString {

    /** Builds "-x-xx-xxx-xx-x-". */
    public String make() {
        return make(3);
    }

    /** Builds a dash-separated string of x groups growing from 1 to {@code peak} and back to 1. */
    public String make(int peak) {
        if (peak < 1) {
            throw new IllegalArgumentException("Peak must be positive: " + peak);
        }
        StringBuilder result = new StringBuilder("-");
        for (int i = 1; i <= peak; i++) {
            result.append("x".repeat(i)).append('-');
        }
        for (int i = peak - 1; i >= 1; i--) {
            result.append("x".repeat(i)).append('-');
        }
        return result.toString();
    }
}
