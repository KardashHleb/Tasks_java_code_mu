package org.example.level8_9;

public class DashedPairsString {

    /** Returns the string "-1-12-23-34-45-": the digit 1 followed by pairs of consecutive digits, all framed by dashes. */
    public String make() {
        StringBuilder result = new StringBuilder("-1-");
        for (int i = 1; i <= 4; i++) {
            result.append(i).append(i + 1).append('-');
        }
        return result.toString();
    }
}
