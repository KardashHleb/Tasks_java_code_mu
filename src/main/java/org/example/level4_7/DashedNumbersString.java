package org.example.level4_7;

public class DashedNumbersString {

    /** Returns the string "-1-2-3-4-5-". */
    public String make() {
        StringBuilder result = new StringBuilder("-");
        for (int i = 1; i <= 5; i++) {
            result.append(i).append('-');
        }
        return result.toString();
    }
}
