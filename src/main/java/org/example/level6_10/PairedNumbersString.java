package org.example.level6_10;

import java.util.StringJoiner;

public class PairedNumbersString {

    /** Builds the string "12 34 56 78". */
    public String build() {
        StringJoiner result = new StringJoiner(" ");
        for (int number = 1; number <= 8; number += 2) {
            result.add(number + "" + (number + 1));
        }
        return result.toString();
    }
}
