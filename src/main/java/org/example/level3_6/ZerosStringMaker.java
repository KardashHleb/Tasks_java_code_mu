package org.example.level3_6;

public class ZerosStringMaker {

    /** Builds a string consisting of the given number of '0' characters. */
    public String makeZeros(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count must not be negative: " + count);
        }
        return "0".repeat(count);
    }
}
