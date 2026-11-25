package org.example.level6_10;

public class AlternatingSignsString {

    /** Builds the string "1+2-3+4-5+6-7+8". */
    public String build() {
        StringBuilder result = new StringBuilder("1");
        for (int number = 2; number <= 8; number++) {
            result.append(number % 2 == 0 ? '+' : '-').append(number);
        }
        return result.toString();
    }
}
