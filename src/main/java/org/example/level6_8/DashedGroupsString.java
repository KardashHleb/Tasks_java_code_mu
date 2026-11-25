package org.example.level6_8;

public class DashedGroupsString {

    /** Builds the string "-1-22-333-4444-55555-": every digit repeated as many times as its value. */
    public String build() {
        StringBuilder result = new StringBuilder("-");
        for (int digit = 1; digit <= 5; digit++) {
            for (int i = 0; i < digit; i++) {
                result.append(digit);
            }
            result.append('-');
        }
        return result.toString();
    }
}
