package org.example.level4_6;

public class CountdownString {

    /** Returns the string "54321". */
    public String make() {
        StringBuilder result = new StringBuilder();
        for (int i = 5; i >= 1; i--) {
            result.append(i);
        }
        return result.toString();
    }
}
