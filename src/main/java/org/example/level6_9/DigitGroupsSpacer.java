package org.example.level6_9;

public class DigitGroupsSpacer {

    /** Splits a string of digits into groups of three from the right: 1234567 becomes "1 234 567". */
    public String group(String number) {
        if (number.isEmpty() || !number.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException("Expected a non-empty string of digits: " + number);
        }
        int firstLength = number.length() % 3 == 0 ? 3 : number.length() % 3;
        StringBuilder result = new StringBuilder(number.substring(0, firstLength));
        for (int index = firstLength; index < number.length(); index += 3) {
            result.append(' ').append(number, index, index + 3);
        }
        return result.toString();
    }
}
