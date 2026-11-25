package org.example.level5_10;

import java.util.StringJoiner;

public class MultiplicationTable {

    /** Builds the multiplication table of the number by 1..9, one line per product. */
    public String build(int number) {
        StringJoiner lines = new StringJoiner("\n");
        for (int i = 1; i <= 9; i++) {
            lines.add(i + " * " + number + " = " + (long) i * number);
        }
        return lines.toString();
    }
}
