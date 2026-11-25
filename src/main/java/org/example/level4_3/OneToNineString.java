package org.example.level4_3;

public class OneToNineString {

    /** Returns the string "123456789". */
    public String make() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            result.append(i);
        }
        return result.toString();
    }
}
